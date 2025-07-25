import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int digit = String.valueOf(num).length();
        int answer = 0;

        while (true) {
            int numA = num * 2;
            int newDigit = String.valueOf(numA).length();

            if (newDigit > digit) {
                break;
            }

            num = numA;
            answer++;
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
