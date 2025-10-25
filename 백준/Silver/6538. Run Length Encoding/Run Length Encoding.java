import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            if (line.isEmpty()) {
                sb.append('\n');
                continue;
            }

            StringBuilder res = new StringBuilder();
            int n = line.length();
            int i = 0;

            while (i < n) {
                int j = i + 1;
                while (j < n && line.charAt(j) == line.charAt(i)) j++;
                int len = j - i;

                if (len >= 2) {
                    while (len > 9) {
                        res.append('9').append(line.charAt(i));
                        len -= 9;
                    }
                    if (len == 1) {
                        res.append('1');
                        char c = line.charAt(i);
                        if (c == '1') res.append("11");
                        else res.append(c);
                        res.append('1');
                    } else {
                        res.append((char) ('0' + len)).append(line.charAt(i));
                    }
                    i = j;
                } else {
                    int start = i;
                    i++;
                    while (i < n) {
                        if (i + 1 < n && line.charAt(i) == line.charAt(i + 1)) break;
                        i++;
                    }
                    res.append('1');
                    for (int k = start; k < i; k++) {
                        char c = line.charAt(k);
                        if (c == '1') res.append("11");
                        else res.append(c);
                    }
                    res.append('1');
                }
            }

            sb.append(res).append('\n');
        }

        System.out.print(sb.toString());
    }
}
