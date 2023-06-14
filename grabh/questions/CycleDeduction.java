package grabh.questions;

import grabh.Edge;
import linkedlist.Node;

import java.util.ArrayList;
import java.util.stream.StreamSupport;

public class CycleDeduction {

    public static void createGraph(ArrayList<Edge> graph[]){

        for (int i =0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
       // graph[3].add(new Edge(3,0));
    }

    public static boolean isCycleDirected(ArrayList<Edge> graph[],boolean vis[],int current,boolean rec[]){
        vis[current] = true;
        rec[current] = true;
        for (int i=0;i<graph[current].size();i++){
            Edge edge= graph[current].get(i);
            if (rec[edge.destination]){
                return true;
            } else if (!vis[edge.destination]) {
                if (isCycleDirected(graph,vis,edge.destination,rec)){
                    return true;
                }
            }
        }
        rec[current] = false;
        return false;
    }

    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        boolean vis[] = new boolean[v];
        boolean rec[] = new boolean[v];
        System.out.println(isCycleDirected(graph,vis,0,rec));

    }
}
