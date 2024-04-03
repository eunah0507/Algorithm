import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final StringTokenizer sb = new StringTokenizer(br.readLine());
        
        final int A = Integer.parseInt(sb.nextToken());
        final int B = Integer.parseInt(sb.nextToken());

        final double P = 1 / (1 + Math.pow(10, (B - A) / 400.0));

        System.out.print(P);
        
        br.close();
    }
}