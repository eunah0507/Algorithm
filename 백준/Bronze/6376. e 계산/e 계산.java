import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        sb.append("n e\n");
        sb.append("- -----------\n");
        sb.append("0 1\n");
        sb.append("1 2\n");
        sb.append("2 2.5\n");

        double factorial = 2;
        double i = 2;
        double result = 2.5;

        while (factorial < 9) {
            factorial++;
            i *= factorial;
            result += 1 / i;
            sb.append(String.format("%.0f %.9f\n", factorial, result));
        }
        
        System.out.print(sb.toString());
    }
}
