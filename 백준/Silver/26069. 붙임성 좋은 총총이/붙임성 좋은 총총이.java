import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        HashSet<String> dancing = new HashSet<>();
        dancing.add("ChongChong");

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if (dancing.contains(a) || dancing.contains(b)) {
                dancing.add(a);
                dancing.add(b);
            }
        }

        sb.append(dancing.size());
        System.out.println(sb.toString());
    }
}
