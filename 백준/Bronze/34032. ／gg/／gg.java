import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'O') count++;
        }

        if (count * 2 >= n) {
            sb.append("Yes");
        } else {
            sb.append("No");
        }

        System.out.println(sb.toString());
    }
}
