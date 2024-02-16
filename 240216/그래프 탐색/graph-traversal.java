import java.util.Scanner;

public class Main {
    public static int dfs(int vertex, int[][] graph, boolean[][] visited) {
        for (int i = 1; i < graph[0].length; i++) {
            if (graph[vertex][i] == 1 && !visited[vertex][i]) {
                visited[vertex][i] = true;
                return dfs(i, graph, visited) + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), result = 0;
        int[][] graph = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1, y = sc.nextInt() - 1;
            graph[x][y] = graph[y][x] = 1;
        }

        System.out.print(dfs(0, graph, visited) - 1);
    }
}