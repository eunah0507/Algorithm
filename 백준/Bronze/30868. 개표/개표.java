import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int vote = Integer.parseInt(br.readLine());
            int vote5 = (vote / 5);
            int voteRemainder = (vote % 5);

            for (int j = 0; j < vote5; j++) {
                sb.append("++++ ");
            }

            for (int j = 0; j < voteRemainder; j++) {
                sb.append("|");
            }

            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}