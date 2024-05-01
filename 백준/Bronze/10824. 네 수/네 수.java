import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        String numA = st.nextToken();
        String numB = st.nextToken();
        String numC = st.nextToken();
        String numD = st.nextToken();

        String sumA = numA + numB;
        String sumB = numC + numD;

        long answerA = Long.parseLong(sumA);
        long answerB = Long.parseLong(sumB);

        long answer = answerA+answerB;


        sb.append(answer);
        System.out.println(sb.toString());
    }
}