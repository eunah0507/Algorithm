import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());
        int count = 1;

        for (int i = 0; i < numA; i++) {
            for (int j = 1; j < numB; j++) {
                sb.append(count).append(" ");
                count++;
            }
            sb.append(count).append("\n");
            count++;
        }

        System.out.println(sb.toString());
    }
}
