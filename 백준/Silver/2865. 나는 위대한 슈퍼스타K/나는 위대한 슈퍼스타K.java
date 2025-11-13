import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numSinger = Integer.parseInt(st.nextToken()); 
        int numGenre = Integer.parseInt(st.nextToken());    
        int numSelect = Integer.parseInt(st.nextToken());   

        double[] bestScore = new double[numSinger + 1];

        for (int g = 0; g < numGenre; g++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < numSinger; j++) {
                int idx = Integer.parseInt(st.nextToken());   
                double score = Double.parseDouble(st.nextToken()); 

                if (score > bestScore[idx]) {
                    bestScore[idx] = score;
                }
            }
        }

        double[] scoreList = new double[numSinger];
        for (int i = 1; i <= numSinger; i++) {
            scoreList[i - 1] = bestScore[i];
        }

        Arrays.sort(scoreList); 

        double answer = 0.0;
        for (int i = 0; i < numSelect; i++) {
            answer += scoreList[numSinger - 1 - i];
        }

        sb.append(String.format("%.1f", answer));
        System.out.print(sb.toString());
    }
}
