import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        int maxScore = -1;
        String answer = "";

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());

            if (score > maxScore) {
                maxScore = score;
                answer = name;
            } else if (score == maxScore) {
                if (name.compareTo(answer) < 0) {
                    answer = name;
                }
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
