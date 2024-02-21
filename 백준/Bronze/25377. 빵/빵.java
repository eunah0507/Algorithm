import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        // int [] arriveTime = new int [num];
        int earlyBread = Integer.MAX_VALUE;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arriveTime = Integer.parseInt(st.nextToken());
            int breadTime = Integer.parseInt(st.nextToken());

            if (arriveTime <= breadTime) {
                earlyBread = Math.min(earlyBread, breadTime);
            }else {
                earlyBread = -1;
            }
        }
        sb.append(earlyBread);

        System.out.println(sb.toString());
    }
}