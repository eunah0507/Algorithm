import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int decimal = 0;
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            decimal = decimal * a + num;
        }

        List<Integer> result = new ArrayList<>();
        while (decimal > 0) {
            result.add(decimal % b);
            decimal /= b;
        }
        Collections.reverse(result);

        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i));
            if (i < result.size() - 1) sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
