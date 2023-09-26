package Graph;

public class GraphUndirected {

    public int[][] adjMatrix(int vertices, int[][] arr) {
        int[][] adj = new int[vertices][vertices];

        for (int i = 0; i < arr.length; i++) {
            adj[arr[i][0]][arr[i][1]] = 1; // value denotes "weight" ie 1 for non weighted graph
            adj[arr[i][1]][arr[i][0]] = 1; // both direction  marked 1 for "Undirected Graph"
        }
        return adj;
    }
}
