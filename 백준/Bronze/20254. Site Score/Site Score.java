import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numUr = Integer.parseInt(st.nextToken());
        int numTr = Integer.parseInt(st.nextToken());
        int numUo = Integer.parseInt(st.nextToken());
        int numTo = Integer.parseInt(st.nextToken());

        int answer = (56 * numUr) + (24 * numTr) + (14 * numUo) + (6 * numTo);
        sb.append(answer);
        System.out.println(sb.toString());

    }
}
