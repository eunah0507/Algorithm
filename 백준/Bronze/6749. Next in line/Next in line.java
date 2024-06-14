import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numA = Integer.parseInt(br.readLine());
        int numB = Integer.parseInt(br.readLine());

        int answer = numB + (numB - numA);

        sb.append(answer);
        System.out.println(sb.toString());

    }
}
