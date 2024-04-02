import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // A+B = C 면 correc!! 출력
        // A+C != C 면 wrong! 출력

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int D = A+B;
        String answer = "";

        if (C == D){
            answer = "correct!";
        }else{
            answer = "wrong!";
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }
}