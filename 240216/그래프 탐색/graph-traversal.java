import java.util.Scanner;

public class Main {
    public static int result = 0;

    public static void DFS(int vertex, int[][] graph, boolean[] visited) {
        for (int i = 1; i < graph[0].length; i++) {
            if (graph[vertex][i] == 1 && !visited[i]) {
                visited[i] = true;
                result++;
                DFS(i, graph, visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] graph = new int[n][n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1, y = sc.nextInt() - 1;
            graph[x][y] = graph[y][x] = 1;
        }

        DFS(0, graph, visited);
        System.out.print(result);
    }
}