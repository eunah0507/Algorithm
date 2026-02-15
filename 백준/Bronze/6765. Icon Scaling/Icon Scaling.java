import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(br.readLine());

        String[] icon = {
            "*x*",
            " xx",
            "* *"
        };

        for (int i = 0; i < 3; i++) {
            for (int repeat = 0; repeat < k; repeat++) {
                for (int j = 0; j < 3; j++) {
                    char c = icon[i].charAt(j);
                    for (int scale = 0; scale < k; scale++) {
                        sb.append(c);
                    }
                }
                sb.append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}
