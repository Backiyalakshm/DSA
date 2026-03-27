import java.util.*;

class Solution {

    class Node {
        int vertex;
        int dist;

        public Node(int vertex, int dist) {
            this.vertex = vertex;
            this.dist = dist;
        }
    }

    public int dijikstra(int[][] times, int n, int k) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);
        pq.add(new Node(k, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();

            for (int i = 0; i < times.length; i++) {
                int u = times[i][0];
                int v = times[i][1];
                int w = times[i][2];

                if (u == node.vertex && dist[v] > dist[u] + w) {
                    dist[v] = dist[u] + w;
                    pq.add(new Node(v, dist[v]));
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) return -1;
            max = Math.max(max, dist[i]);
        }

        return max;
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        return dijikstra(times, n, k);
    }
}