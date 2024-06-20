import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       int num = Integer.parseInt(br.readLine());
       int winA = 0;
       int winB = 0;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int scoreA = Integer.parseInt(st.nextToken());
            int scoreB = Integer.parseInt(st.nextToken());

            if (scoreA == scoreB){
                continue;
            }else if(scoreA > scoreB){
                winA++;
            }else{
                winB++;
            }
        }

        sb.append(winA).append(" ").append(winB);
        System.out.println(sb.toString());
    }
}
