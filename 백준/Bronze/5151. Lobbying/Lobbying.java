import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine()); 

        for (int dataset = 1; dataset <= K; dataset++) {
            sb.append("Data Set ").append(dataset).append(":\n");
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken()); 
            int m = Integer.parseInt(st.nextToken());
            int T = Integer.parseInt(st.nextToken()); 
            
            double[] donations = new double[n + 1];
            
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int lawmaker = Integer.parseInt(st.nextToken());
                int time = Integer.parseInt(st.nextToken());
                double amount = Double.parseDouble(st.nextToken());

                if (T - time >= 0 && T - time < 1000) {
                    donations[lawmaker] += amount;
                }
            }

            double votesFor = 0.0;
            double votesAgainst = 0.0;

            for (int i = 1; i <= n; i++) {
                char vote = br.readLine().charAt(0);
                if (vote == 'Y') {
                    votesFor += 1.0; 
                } else if (vote == 'N') {
                    votesAgainst += 1.0 / (1.0 + (donations[i] / 10000.0));
                }
            }

            sb.append(String.format("%.2f %.2f\n\n", votesFor, votesAgainst));
        }

        System.out.print(sb.toString());
    }
}