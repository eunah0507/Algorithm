import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.valueOf(br.readLine()); 
        int W = Integer.valueOf(br.readLine()); 

        int score = N * 10;

        if (N >= 3) score += 20;
        if (N == 5) score += 50;
        if (W > 1000) score -= 15;

        if (score < 0) score = 0;

        sb.append(score);
        System.out.print(sb.toString());
    }
}
