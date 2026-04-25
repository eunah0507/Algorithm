import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] parts = br.readLine().split("-");
        int answer = sum(parts[0]);

        for (int i = 1; i < parts.length; i++) {
            answer -= sum(parts[i]);
        }

        sb.append(answer);
        System.out.print(sb.toString());
    }

    private static int sum(String expression) {
        String[] numbers = expression.split("\\+");
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }

        return sum;
    }
}