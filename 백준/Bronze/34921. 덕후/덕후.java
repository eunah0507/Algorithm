import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());

        int count = 10 + 2 * (25 - numA + numB);
        int answer = 0;

        if (count < 0){
            answer = 0;
        }else{
            answer = count;
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
