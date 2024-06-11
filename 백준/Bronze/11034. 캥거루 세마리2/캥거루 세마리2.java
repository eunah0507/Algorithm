import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        String str;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);

            int kang1 = Integer.parseInt(st.nextToken());
            int kang2 = Integer.parseInt(st.nextToken());
            int kang3 = Integer.parseInt(st.nextToken());

            int answer = Math.max((kang2 - kang1), (kang3 - kang2));
            answer -= 1;

            System.out.println(answer);
        }
    }
}
