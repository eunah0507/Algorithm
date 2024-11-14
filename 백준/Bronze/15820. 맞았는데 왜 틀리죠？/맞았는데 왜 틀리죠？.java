import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // 첫 째 줄에 테스트케이스 S1과 시스템 케이스 S2
        // 둘 째 줄부터는 테스트케이스의 정답과 시스템 케이스의 정답이 주어진다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int testCase = Integer.parseInt(st.nextToken());
        int systemCase = Integer.parseInt(st.nextToken());
        int count = 0;
        String answer = "";

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int min = Integer.parseInt(st.nextToken());
            int correct = Integer.parseInt(st.nextToken());

            if (min == correct) {
                count++;
            } else {
                answer = "Wrong Answer";
            }
        }

        for (int i = 0; i < systemCase; i++) {
            st = new StringTokenizer(br.readLine());
            int min = Integer.parseInt(st.nextToken());
            int correct = Integer.parseInt(st.nextToken());

            if (min == correct) {
                count++;
            } else {
                answer = "Why Wrong!!!";
            }
        }

        if (count == (testCase + systemCase)) {
            answer = "Accepted";
        }

        sb.append(answer);
        System.out.println(sb.toString());


    }
}
