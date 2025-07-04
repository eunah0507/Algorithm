import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        br.readLine();
        
        String s = br.readLine();

        for (char ch : s.toCharArray()) {
            if (ch != 'J' && ch != 'A' && ch != 'V') {
                sb.append(ch);
            }
        }

        if (sb.length() == 0) {
            System.out.println("nojava");
        } else {
            System.out.println(sb.toString());
        }
    }
}
