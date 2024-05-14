import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 원소 개수 N이 주어진다. A, B를 각각 입력받는다.
        // A와 B 중 더 작은 수를 출력한다.
        // String으로 받아서 붙여준 뒤, 다시 숫자로 변환시켜 비교한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        long A = 0;
        long B = 0;
        String answerA = "";
        String answerB = "";

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int j = 0; j < num; j++) {
            long numA = Integer.parseInt(st.nextToken());
            answerA += numA;
        }

        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < num; j++) {
            long numB = Integer.parseInt(st.nextToken());
            answerB += numB;
        }

        A = Long.parseLong(answerA);
        B = Long.parseLong(answerB);

        if (A > B){
            sb.append(B);
        }else if(B > A){
            sb.append(A);
        }else{
            sb.append(A);
        }

        System.out.println(sb.toString());
    }
}