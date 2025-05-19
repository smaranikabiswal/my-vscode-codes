

public class dfs{
    public static void main(String[] args) {
        int[][] graph = {
            {1, 2},    // neighbors of 0
            {0, 3},    // neighbors of 1
            {0, 4},    // neighbors of 2
            {1},       // neighbors of 3
            {2}        // neighbors of 4
        };

        boolean[] visited = new boolean[5];
        System.out.println("DFS:");
        dfs(0, graph, visited);
    }

    static void dfs(int node, int[][] graph, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : graph[node]) {
            if (!visited[neighbor])
                dfs(neighbor, graph, visited);
        }
    }
}