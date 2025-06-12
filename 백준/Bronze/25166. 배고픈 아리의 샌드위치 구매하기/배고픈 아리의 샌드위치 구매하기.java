import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int[] coins = {1,2,4,8,16,32,64,128,256,512};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int price = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        if (price <= 1023) {
            sb.append("No thanks");
        } else {
            int need = price - 1023;

            boolean possible = false;
            for (int i = 0; i < (1 << 10); i++) {
                int sum = 0;
                for (int j = 0; j < 10; j++) {
                    if (((m >> j) & 1) == 1 && ((i >> j) & 1) == 1) {
                        sum += coins[j];
                    }
                }
                if (sum == need) {
                    possible = true;
                    break;
                }
            }

            if (possible) {
                sb.append("Thanks");
            } else {
                sb.append("Impossible");
            }
        }

        System.out.print(sb.toString());
    }
}
