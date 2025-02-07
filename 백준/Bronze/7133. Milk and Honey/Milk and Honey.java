import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 첫 번째 줄: M, D_M (소의 행복)
        String[] firstLine = br.readLine().split(" ");
        int M = Integer.parseInt(firstLine[0]);
        int D_M = Integer.parseInt(firstLine[1]);

        // 두 번째 줄: H, D_H (벌의 행복)
        String[] secondLine = br.readLine().split(" ");
        int H = Integer.parseInt(secondLine[0]);
        int D_H = Integer.parseInt(secondLine[1]);

        // 세 번째 줄: N (필드의 수)
        int N = Integer.parseInt(br.readLine());

        // 각 필드에 대해 C (소의 수), B (벌의 수)
        int[][] fields = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] field = br.readLine().split(" ");
            fields[i][0] = Integer.parseInt(field[0]); // 소의 수
            fields[i][1] = Integer.parseInt(field[1]); // 벌의 수
        }

        // 최대 행복을 계산할 변수
        int totalHappiness = 0;

        // 각 필드에 대해 소와 벌을 배치
        for (int i = 0; i < N; i++) {
            int cows = fields[i][0];
            int bees = fields[i][1];

            // 소의 행복 계산
            int cowHappiness = 0;
            for (int j = 0; j < cows; j++) {
                int happiness = M - j * D_M;
                if (happiness > 0) {
                    cowHappiness += happiness;
                } else {
                    break;  // 행복이 0 이하로 떨어지면 멈춤
                }
            }

            // 벌의 행복 계산
            int beeHappiness = 0;
            for (int j = 0; j < bees; j++) {
                int happiness = H - j * D_H;
                if (happiness > 0) {
                    beeHappiness += happiness;
                } else {
                    break;  // 행복이 0 이하로 떨어지면 멈춤
                }
            }

            // 필드에 배치된 소와 벌에서 얻은 행복을 합산
            totalHappiness += Math.max(cowHappiness, beeHappiness);
        }

        // 결과 출력
        sb.append(totalHappiness);
        System.out.println(sb.toString());
    }
}
