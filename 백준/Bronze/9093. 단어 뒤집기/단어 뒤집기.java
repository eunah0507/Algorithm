import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String line = br.readLine();
            String[] words = line.split(" ");

            for (int j = 0; j < words.length; j++) {
                sb.append(new StringBuilder(words[j]).reverse());
                if (j < words.length - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
