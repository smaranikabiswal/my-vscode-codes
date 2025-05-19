import java.util.*;

public class krushkal{

    static int[] parent;

    static int find(int i) {
        if (parent[i] == i) return i;
        return parent[i] = find(parent[i]);
    }

    static void union(int a, int b) {
        parent[find(a)] = find(b);
    }

    public static void main(String[] args) {
        int V = 4; // number of vertices
        int[][] edges = {
            {0, 1, 10},
            {0, 2, 6},
            {0, 3, 5},
            {1, 3, 15},
            {2, 3, 4}
        };

        Arrays.sort(edges, Comparator.comparingInt(e -> e[2]));

        parent = new int[V];
        for (int i = 0; i < V; i++) parent[i] = i;

        int mstWeight = 0;
        System.out.println("Edges in MST:");

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            if (find(u) != find(v)) {
                union(u, v);
                mstWeight += w;
                System.out.println(u + " - " + v + " : " + w);
            }
        }

        System.out.println("Total weight = " + mstWeight);
    }
}