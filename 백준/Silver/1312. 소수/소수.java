import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] tokens = br.readLine().split(" ");
        int numA = Integer.parseInt(tokens[0]);
        int numB = Integer.parseInt(tokens[1]);
        int n = Integer.parseInt(tokens[2]);

        int remainder = numA % numB;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            remainder *= 10;
            answer = remainder / numB;
            remainder = remainder % numB;
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
