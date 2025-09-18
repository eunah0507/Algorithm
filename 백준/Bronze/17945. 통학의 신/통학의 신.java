import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int discriminant = A * A - B;
        int sqrtD = (int) Math.sqrt(discriminant);

        int root1 = -A - sqrtD;
        int root2 = -A + sqrtD;

        StringBuilder sb = new StringBuilder();
        String answer;

        if (root1 == root2) {
            answer = String.valueOf(root1);
        } else {
            if (root1 < root2) {
                answer = root1 + " " + root2;
            } else {
                answer = root2 + " " + root1;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}