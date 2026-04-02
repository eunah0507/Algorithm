import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            if (s.startsWith("http://")) {
                s = s.substring(7);
            }

            int slashIdx = s.indexOf('/');
            String host;
            if (slashIdx == -1) {
                host = s;
            } else {
                host = s.substring(0, slashIdx);
            }

            int dotIdx = host.lastIndexOf('.');
            String domain;
            if (dotIdx == -1) {
                domain = host;
            } else {
                domain = host.substring(dotIdx + 1);
            }

            map.put(domain, map.getOrDefault(domain, 0) + 1);
        }

        int max = 0;
        for (int count : map.values()) {
            if (count > max) {
                max = count;
            }
        }

        sb.append(max).append('\n');

        boolean first = true;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                if (!first) {
                    sb.append(' ');
                }
                sb.append(entry.getKey());
                first = false;
            }
        }

        System.out.print(sb.toString());
    }
}