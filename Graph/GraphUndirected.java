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
}
