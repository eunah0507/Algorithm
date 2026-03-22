import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int idx = s.indexOf('-');

        if (idx == -1) {
            sb.append("NO");
        } else {
            String inst = s.substring(0, idx);
            String team = s.substring(idx + 1);

            if (inst.length() > 1 && inst.length() <= 8 && team.length() >= 1 && team.length() <= 24 && inst.indexOf('-') == -1) {
                sb.append("YES");
            } else {
                sb.append("NO");
            }
        }

        System.out.print(sb.toString());
    }
}