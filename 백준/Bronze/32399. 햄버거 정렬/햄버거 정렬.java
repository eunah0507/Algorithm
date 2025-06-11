import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine().trim();

        if (str.equals(")1(")) {
            sb.append(2);
        } else if (str.equals("(1)")) {
            sb.append(0);
        } else {
            sb.append(1);
        }

        System.out.print(sb.toString());
    }
}
