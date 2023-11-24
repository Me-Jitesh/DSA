package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphUndirected {

    public int[][] adjMatrix(int vertices, int[][] arr) {
        int[][] adj = new int[vertices][vertices];

        for (int i = 0; i < arr.length; i++) {
            adj[arr[i][0]][arr[i][1]] = 1; // value denotes "weight" ie 1 for non weighted graph
            adj[arr[i][1]][arr[i][0]] = 1; // both direction  marked 1 for "Undirected Graph"
        }
        return adj;
    }

    public void dfs(int[][] adjMatrix) {
        int[] visited = new int[adjMatrix.length]; // length = no of vertices

        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == 0) {
                solveDFS(i, adjMatrix, visited);
            }
        }
    }

    private void solveDFS(int row, int[][] adjMatrix, int[] visited) {
        System.out.println("Vertex = " + row);
        visited[row] = 1;

        for (int col = 0; col < adjMatrix.length; col++) {
            if (adjMatrix[row][col] == 1 && visited[col] == 0) {
//                System.out.println(row + "  =>  " + col); // Print Path
                solveDFS(col, adjMatrix, visited);
            }
        }
    }

    public void bfs(int[][] adjMatrix) {
        int[] visited = new int[adjMatrix.length];

        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == 0) {
                solveBFS(i, adjMatrix, visited);
            }
        }
    }

    private void solveBFS(int sv, int[][] adjMatrix, int[] visited) {

        Queue<Integer> q = new LinkedList<>();

        q.add(sv);
        visited[sv] = 1;

        while (!q.isEmpty()) {
            Integer v = q.poll();
            System.out.println("Vertex => " + v);

            for (int ev = 0; ev < adjMatrix.length; ev++) {
                if (adjMatrix[v][ev] == 1 && visited[ev] == 0) {
                    q.add(ev);
                    visited[ev] = 1;
                }
            }
        }
    }
}
