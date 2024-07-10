import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();

        int answer = 0;

        if (input.startsWith("0x")) {
            answer = Integer.parseInt(input.substring(2), 16);
        } else if (input.startsWith("0")) {
            answer = Integer.parseInt(input.substring(1), 8);
        } else {
            answer = Integer.parseInt(input);
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
