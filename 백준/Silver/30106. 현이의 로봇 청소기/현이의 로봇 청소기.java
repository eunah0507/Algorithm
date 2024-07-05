import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static int[][] area;
    public static boolean[][] isCheck;
    public static int N, M, K;

    public static int answer = 0;

    public static int[] dirR = {-1, 1, 0, 0};
    public static int[] dirC = {0, 0, -1, 1};

    public static class Location {
        public int r, c;

        public Location(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public static void startClean(int r, int c) {
        answer++;
        Queue<Location> queue = new LinkedList<>();
        queue.add(new Location(r, c));
        isCheck[r][c] = true;

        while (!queue.isEmpty()) {
            Location cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextR = cur.r + dirR[i];
                int nextC = cur.c + dirC[i];
                if (nextR >= 0 && nextR < N && nextC >= 0 && nextC < M
                        && !isCheck[nextR][nextC]
                        && Math.abs(area[nextR][nextC] - area[cur.r][cur.c]) <= K) {
                    queue.add(new Location(nextR, nextC));
                    isCheck[nextR][nextC] = true;
                }
            }
        }
    }

    public static void print(){
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(isCheck[i][j] ? 1: 0);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        area = new int[N][M];
        isCheck = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                area[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        for (int i = 0; i < N; i++) {

            for (int j = 0; j < M; j++) {
                if (!isCheck[i][j]) {
                    startClean(i, j);
//                    print();
                }
            }

        }

        System.out.println(answer);


    }
}
