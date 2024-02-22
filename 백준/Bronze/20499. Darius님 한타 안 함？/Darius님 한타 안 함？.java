import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), "/");

        int K = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());

        String answer = "";

        if ((K + A) < D || D == 0){
            answer = "hasu";
        }else {
            answer = "gosu";
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }
}