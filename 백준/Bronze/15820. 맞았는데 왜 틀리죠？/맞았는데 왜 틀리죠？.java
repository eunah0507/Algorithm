import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int testCase = Integer.parseInt(st.nextToken());
        int systemCase = Integer.parseInt(st.nextToken());

        boolean wrongAnswer = false;
        boolean whyWrong = false;

        // 샘플 테스트케이스 처리
        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int expected = Integer.parseInt(st.nextToken());
            int actual = Integer.parseInt(st.nextToken());

            if (expected != actual) {
                wrongAnswer = true;
            }
        }

        // 시스템 테스트케이스 처리
        for (int i = 0; i < systemCase; i++) {
            st = new StringTokenizer(br.readLine());
            int expected = Integer.parseInt(st.nextToken());
            int actual = Integer.parseInt(st.nextToken());

            if (expected != actual) {
                whyWrong = true;
            }
        }

        // 결과 출력
        if (wrongAnswer) {
            System.out.println("Wrong Answer");
        } else if (whyWrong) {
            System.out.println("Why Wrong!!!");
        } else {
            System.out.println("Accepted");
        }
    }
}
