import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long totalCents = 0;
        String line;

        while ((line = br.readLine()) != null && line.length() > 0) {
            int dotIndex = line.indexOf('.');
            long euros = Long.parseLong(line.substring(0, dotIndex));
            long cents = Long.parseLong(line.substring(dotIndex + 1));
            totalCents += euros * 100 + cents;
        }

        long resultEuros = totalCents / 100;
        long resultCents = totalCents % 100;

        sb.append(resultEuros).append('.');
        if (resultCents < 10) {
            sb.append('0');
        }
        sb.append(resultCents);

        System.out.print(sb.toString());
    }
}
