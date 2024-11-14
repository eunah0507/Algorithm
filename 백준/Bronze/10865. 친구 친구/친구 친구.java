import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [] student = new int [n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int studentA = Integer.parseInt(st.nextToken());
            int studentB = Integer.parseInt(st.nextToken());

            student[studentA]++;
            student[studentB]++;
        }

        // forEach문을 쓰면 0번째 값도 나오니가 일반 for문 사용
        for (int i = 1; i <= n; i++) {
            sb.append(student[i]).append("\n");
        }

        System.out.print(sb.toString());
    }
}
