import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());


        double huddleScore = 0;
        double highScore = 0;
        double poScore = 0;
        double meter200Score = 0;
        double farScore = 0;
        double changScore = 0;
        double meter800Score = 0;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int huddle = Integer.parseInt(st.nextToken());
            int high = Integer.parseInt(st.nextToken());
            int po = Integer.parseInt(st.nextToken());
            int meter200 = Integer.parseInt(st.nextToken());
            int far = Integer.parseInt(st.nextToken());
            int chang = Integer.parseInt(st.nextToken());
            int meter800 = Integer.parseInt(st.nextToken());

            int totalScore = 0;

            huddleScore = 9.23076 * Math.pow((26.7 - huddle), 1.835);
            highScore = 1.84523 * Math.pow((high - 75), 1.348);
            poScore = 56.0211 * Math.pow((po - 1.5), 1.05);
            meter200Score = 4.99087 * Math.pow((42.5 - meter200), 1.81);
            farScore = 0.188807 * Math.pow((far - 210), 1.41);
            changScore = 15.9803 * Math.pow((chang - 3.8), 1.04);
            meter800Score = 0.11193 * Math.pow((254 - meter800), 1.88);

            totalScore = (int)huddleScore + (int)highScore + (int)poScore + (int)meter200Score + (int)farScore + (int)changScore + (int)meter800Score;
            sb.append(totalScore).append("\n");

        }

        System.out.println(sb.toString());
    }
}
