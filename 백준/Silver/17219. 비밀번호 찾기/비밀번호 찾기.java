import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // HashMap을 사용해서 풀자!

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < numA; i++) {
            st = new StringTokenizer(br.readLine());

            String site = st.nextToken();
            String password = st.nextToken();

            map.put(site, password);
        }

        for (int i = 0; i < numB; i++) {
            st = new StringTokenizer(br.readLine());

            String findPassword = st.nextToken();
            sb.append(map.get(findPassword)).append("\n");
        }

        System.out.println(sb.toString());
    }
}