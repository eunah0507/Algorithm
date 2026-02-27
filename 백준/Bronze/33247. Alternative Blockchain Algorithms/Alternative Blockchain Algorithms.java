import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine().trim());

        long balance = 0;
        int prevId = -1;

        for (int idx = 0; idx < n; idx++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int id = Integer.parseInt(st.nextToken());
            int parent = Integer.parseInt(st.nextToken());
            int amt = Integer.parseInt(st.nextToken());

            if (idx == 0) {
                if (parent != 0) {
                    System.out.print("INVALID");
                    return;
                }
            } else {
                if (parent != prevId) {
                    System.out.print("INVALID");
                    return;
                }
            }

            balance += amt;
            if (balance < 0) {
                System.out.print("NO_MONEY");
                return;
            }

            prevId = id;
        }

        sb.append(balance);
        System.out.print(sb.toString());
    }
}