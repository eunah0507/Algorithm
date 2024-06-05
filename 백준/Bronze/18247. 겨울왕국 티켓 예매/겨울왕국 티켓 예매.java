import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int seatA = Integer.parseInt(st.nextToken());
            int seatB = Integer.parseInt(st.nextToken());

            if (seatA < 12 || seatB < 4){
                sb.append(-1).append("\n");
            }else{
                answer = (12 * seatB) - (seatB - 4);
                sb.append(answer).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
