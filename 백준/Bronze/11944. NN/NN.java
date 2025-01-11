import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int numberN = Integer.parseInt(n);
        int m = Integer.parseInt(st.nextToken());
        int len = n.length();

        for(int i = 0; i < numberN * len && i <= m; i += len) {
            sb.append(n);
        }

        if(sb.length() > m) {
            System.out.print(sb.toString().substring(0, m));
        }
        else {
            System.out.print(sb.toString());
        }
    }
}
