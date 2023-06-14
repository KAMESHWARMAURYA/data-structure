package grabh.shotestpathAlgorithm;

import java.util.ArrayList;



public class DijkstraAlgorithm {

    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
    }
}
