import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); 
        int M = Integer.parseInt(br.readLine()); 

        int[] targets = new int[M]; 
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            targets[i] = Integer.parseInt(st.nextToken()) - 1;
        }

        int[] score = new int[N]; 

        for (int i = 0; i < M; i++) {
            int target = targets[i];
            st = new StringTokenizer(br.readLine());

            int wrongGuess = 0;

            for (int j = 0; j < N; j++) {
                int guess = Integer.parseInt(st.nextToken()) - 1;

                if (j == target) {
                    score[j] += 1; 
                } else if (guess == target) {
                    score[j] += 1; 
                } else {
                    wrongGuess++;
                }
            }

            score[target] += wrongGuess;
        }

        for (int s : score) {
            sb.append(s).append('\n');
        }

        System.out.print(sb.toString());
    }
}
