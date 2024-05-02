import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 누가 우승했나?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String answer = "";
        int aCount = 0;
        int bCount = 0;

        for (int i = 0; i < num; i++) {
            char ch = str.charAt(i);

            if (ch == 'A') {
                aCount++;
            } else {
                bCount++;
            }
        }

        if (aCount > bCount) {
            answer = "A";
        } else if (aCount == bCount) {
            answer = "Tie";
        } else {
            answer = "B";
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}