import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String n = br.readLine();
        int len = n.length();
        int half = len / 2;

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < half; i++) {
            leftSum += n.charAt(i) - '0';
        }

        for (int i = half; i < len; i++) {
            rightSum += n.charAt(i) - '0';
        }

        if (leftSum == rightSum) {
            sb.append("LUCKY");
        } else {
            sb.append("READY");
        }

        System.out.print(sb.toString());
    }
}
