import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            list.add(br.readLine());
        }

        for (String word : list) {
            String reversed = new StringBuilder(word).reverse().toString();
            if (list.contains(reversed)) {
                int len = word.length();
                char mid = word.charAt(len / 2);
                sb.append(len).append(" ").append(mid);
                break;
            }
        }

        System.out.print(sb.toString());
    }
}
