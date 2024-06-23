import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // N명의 출제자들과 M명의 검수자드로 이뤄진다.
        // 출제자는 1번부터 N번까지, 검수자는 N+M번까지 매겨진다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 받는 출제비를 배열로 만든다.
        int [] arr = new int[n];

        // 값을 입력받는다.
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 나눠주는 돈 역시 배열로 만든 뒤, 입력받는다.
        int [][] shareMoney = new int[n][n+m];
        for (int i = 0; i < n; i++) {
        st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n + m; j++) {
                shareMoney[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 정답 배열
        int [] finalAmount = new int [n+m];
        for (int i = 0; i < n; i++) {
            finalAmount[i] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + m; j++) {
                finalAmount[j] += shareMoney[i][j];
                finalAmount[i] -= shareMoney[i][j];
            }
        }

        for (int i = 0; i < n+m; i++) {
            sb.append(finalAmount[i]).append(" ");
        }

        System.out.println(sb.toString());
    }
}
