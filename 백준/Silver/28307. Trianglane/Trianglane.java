import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int c = Integer.parseInt(br.readLine());

        int[][] map = new int[2][c];

        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < c; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < c; j++) {
                if (map[i][j] == 1) ans += 3;
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < c; j++) {
                if (map[i][j] == 1 && map[i][j - 1] == 1) ans -= 2;
            }
        }

        for (int j = 0; j < c; j += 2) {
            if (map[0][j] == 1 && map[1][j] == 1) ans -= 2;
        }

        sb.append(ans);
        System.out.print(sb.toString());
    }
}