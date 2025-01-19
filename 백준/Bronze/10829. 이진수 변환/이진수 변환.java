import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine());
        boolean check = false;

        for (int i = 49; i >= 0; i--) {
            boolean is1bit = (n&1l<<i) != 0;
            
            if (!check && !is1bit) continue;
            check = true;

            sb.append(is1bit?1:0);
        }

        System.out.println(sb.toString());
    }
}