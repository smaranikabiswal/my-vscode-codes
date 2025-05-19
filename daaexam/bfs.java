import java.util.*;

public class bfs{
    public static void main(String[] args) {
        int[][] graph = {
            {1, 2},    // neighbors of 0
            {0, 3},    // neighbors of 1
            {0, 4},    // neighbors of 2
            {1},       // neighbors of 3
            {2}        // neighbors of 4
        };

        boolean[] visited = new boolean[5];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        System.out.println("BFS:");

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int neighbor : graph[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }
}