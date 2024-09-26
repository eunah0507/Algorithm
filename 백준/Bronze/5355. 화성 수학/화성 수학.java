import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            String[] strs = str.split(" ");

            double answer = -1;

            for (int j = 0; j < strs.length; j++) {
                if (j == 0) {
                    answer = Double.parseDouble(strs[0]);
                } else {
                    switch (strs[j]) {
                        case "@":
                            answer *= 3;
                            break;
                        case "%":
                            answer += 5;
                            break;
                        case "#":
                            answer -= 7;
                            break;
                        default:
                            break;
                    }
                }
                if (j == strs.length - 1)
                    sb.append(String.format("%.2f", answer)).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
