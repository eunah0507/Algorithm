import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            int answer = 1;

            if(num == 0) {
                break;
            }

            for(int i = 0; i < 2 * num; i++) {
                int M = Integer.parseInt(st.nextToken());

                if(i % 2 == 0) {
                    answer *= M;
                }else {
                    answer -= M;
                }
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb.toString());
    }
}
