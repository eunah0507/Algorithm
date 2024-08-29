import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        double numA = Double.parseDouble(st.nextToken());
        double numB = Double.parseDouble(st.nextToken());
        double numC = Double.parseDouble(st.nextToken());

        double answerA = (numA + numB + numC) / 2 - numC;
        double answerB = (numA + numB + numC) / 2 - numB;
        double answerC = (numA + numB + numC) / 2 - numA;

        if (answerA <= 0 || answerB <= 0 || answerC <= 0) {
            sb.append(-1).append("\n");
            System.out.println(sb.toString());
            return;
        } else {
            sb.append(1).append("\n");
        }

        sb.append(answerA).append(" ").append(answerB).append(" ").append(answerC);
        System.out.println(sb.toString());
    }
}
