import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] cards = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            cards[i][0] = Integer.parseInt(st.nextToken()); 
            cards[i][1] = Integer.parseInt(st.nextToken()); 
        }

        int[] cardStates = new int[N]; 

        for (int m = 0; m < M; m++) {
            int K = Integer.parseInt(br.readLine());

            for (int i = 0; i < N; i++) {
                int currentFace = cards[i][cardStates[i]]; 

                if (currentFace <= K) {
                    cardStates[i] = 1 - cardStates[i];
                }
            }
        }

        int totalSum = 0;
        for (int i = 0; i < N; i++) {
            totalSum += cards[i][cardStates[i]];
        }

        System.out.println(totalSum);
        br.close();
    }
}
