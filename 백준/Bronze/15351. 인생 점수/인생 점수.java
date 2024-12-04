import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        char[] abc = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',  'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        for (int i = 0; i < num; i++) {
            String str = br.readLine();

            int sum = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                for (int k = 0; k < abc.length; k++) {
                    if (ch == abc[k]) {
                        sum += k + 1;
                    }
                }
            }

            if (sum == 100) {
                sb.append("PERFECT LIFE").append("\n");
            } else {
                sb.append(sum).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
