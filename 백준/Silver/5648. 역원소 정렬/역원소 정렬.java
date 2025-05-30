import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        List<Long> list = new ArrayList<>();
        int total = 0;

        while (list.size() < total || total == 0) {
            String line = br.readLine();
            if (line == null) break; // EOF 대응

            String[] tokens = line.trim().split(" ");
            for (String token : tokens) {
                if (token.isEmpty()) continue;

                if (total == 0) {
                    total = Integer.parseInt(token);
                } else {
                    String reversed = new StringBuilder(token).reverse().toString();
                    list.add(Long.parseLong(reversed));
                }
            }
        }

        Collections.sort(list);

        for (long num : list) {
            sb.append(num).append("\n");
        }

        System.out.print(sb.toString());
    }
}
