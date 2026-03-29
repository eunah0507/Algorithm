import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        boolean missing = false;

        if (!set.contains("keys")) {
            sb.append("keys\n");
            missing = true;
        }
        if (!set.contains("phone")) {
            sb.append("phone\n");
            missing = true;
        }
        if (!set.contains("wallet")) {
            sb.append("wallet\n");
            missing = true;
        }

        if (!missing) {
            sb.append("ready");
        }

        System.out.print(sb);
    }
}