import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int day = Integer.parseInt(st.nextToken());
        int car = 5;
        st = new StringTokenizer(br.readLine());

        int count = 0;

        for (int i = 0; i < car; i++) {
            int carNumber = Integer.parseInt(st.nextToken());

            if (day == carNumber) {
                count++;
            }
        }

        sb.append(count);

        System.out.println(sb.toString());

    }
}