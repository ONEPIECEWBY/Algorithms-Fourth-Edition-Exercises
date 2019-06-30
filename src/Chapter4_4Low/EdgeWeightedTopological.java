package Chapter4_4Low;

import Chapter4_4Text.DepthFirstOrder;
import Chapter4_4Text.EdgeWeightedCycleFinder;
import Chapter4_4Text.EdgeWeightedDigraph;

//Exercise 4.4.12
public class EdgeWeightedTopological {  //结点的拓扑排序
    private Iterable<Integer> order;  //结点的拓扑顺序
    public EdgeWeightedTopological(EdgeWeightedDigraph G){
        EdgeWeightedCycleFinder cyclefinder=new EdgeWeightedCycleFinder(G);
        if(!cyclefinder.hasCycle()){
            DepthFirstOrder dfs=new DepthFirstOrder(G);
            order=dfs.reversePost();  //使用逆后序的排列顺序
        }
    }

    public Iterable<Integer> order(){return order;}  //返回拓扑有序的所有结点
    public boolean isDAG(){return order!=null;}  //是否是有向无环图
}
