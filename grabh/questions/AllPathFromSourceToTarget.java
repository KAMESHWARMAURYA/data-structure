package grabh.questions;

import java.util.ArrayList;

public class AllPathFromSourceToTarget {
    /*
    * All path from source to target
    * for given source to target, print all paths that exist from source to target
    *
    *
    *
    */

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    // time complexity = O(v^v)
    public static void printAllPath(ArrayList<Edge> graph[], int currentNode, boolean visited[],String path, int target){
        if (currentNode == target){
            System.out.println(path);
            return;
        }
        for (int i=0;i<graph[currentNode].size();i++){
            Edge e = graph[currentNode].get(i);
            if (visited[e.destination]== false){
                visited[currentNode] = true;
                printAllPath(graph,e.destination,visited,path+e.destination,target);
                visited[currentNode] = false;
            }
        }
    }

    public static void main(String args[]){
        int v=7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        boolean visited[] = new boolean[v];
        createGraph(graph);
        int source = 0;
        int target = 5;
        printAllPath(graph,source,visited,"o",target);
    }

}
