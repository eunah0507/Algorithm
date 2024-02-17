import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int minScore = 0;
        int manScore = 0;

        for (int i = 0; i < 4; i++) {
            minScore += Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            manScore += Integer.parseInt(st.nextToken());
        }

        int answer = Math.max(minScore, manScore);
        
        sb.append(answer);
        System.out.println(sb.toString());
    }
}