import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] clubs = {
            "PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", 
            "MOTION", "SPG", "COMON", "ALMIGHTY"
        };

        int bestScore = -1;
        String bestClub = "";

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int maxInClub = -1;
            for (int j = 0; j < N; j++) {
                int score = Integer.parseInt(st.nextToken());
                if (score > maxInClub) {
                    maxInClub = score;
                }
            }
            if (maxInClub > bestScore) {
                bestScore = maxInClub;
                bestClub = clubs[i];
            }
        }

        sb.append(bestClub);
        System.out.println(sb.toString());
    }
}
