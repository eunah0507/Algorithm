import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine().trim();

        if (!s.contains("+")) {
            sb.append("No Money");
            System.out.println(sb.toString());
            return;
        }

        String[] parts = s.split("\\+");
        if (parts.length != 2) {
            sb.append("No Money");
            System.out.println(sb.toString());
            return;
        }

        String left = parts[0];
        String right = parts[1];

        if (left.isEmpty() || right.isEmpty()) {
            sb.append("No Money");
            System.out.println(sb.toString());
            return;
        }

        if (left.charAt(0) == '0' || right.charAt(0) == '0') {
            sb.append("No Money");
            System.out.println(sb.toString());
            return;
        }

        try {
            long a = Long.parseLong(left);
            long b = Long.parseLong(right);
            if (a == b) {
                sb.append("CUTE");
            } else {
                sb.append("No Money");
            }
        } catch (NumberFormatException e) {
            sb.append("No Money");
        }

        System.out.println(sb.toString());
    }
}
