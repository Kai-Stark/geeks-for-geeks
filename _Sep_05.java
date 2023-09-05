package geeks_for_geeks;

import java.util.ArrayList;
import java.util.List;

public class _Sep_05 {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<V; i++) adj.add(new ArrayList<>());
        for(int i=0; i<edges.length; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        return adj;
    }
}
