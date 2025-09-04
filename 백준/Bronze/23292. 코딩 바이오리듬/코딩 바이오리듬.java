import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String birth = br.readLine().trim();
        int n = Integer.parseInt(br.readLine().trim());

        String by = birth.substring(0, 4);
        String bm = birth.substring(4, 6);
        String bd = birth.substring(6, 8);

        int[] Y = new int[4];
        int[] M = new int[2];
        int[] D = new int[2];

        for (int i = 0; i < 4; i++) Y[i] = by.charAt(i) - '0';
        for (int i = 0; i < 2; i++) M[i] = bm.charAt(i) - '0';
        for (int i = 0; i < 2; i++) D[i] = bd.charAt(i) - '0';

        int best = -1;
        String answer = "";

        for (int i = 0; i < n; i++) {
            String s = br.readLine().trim();
            String cy = s.substring(0, 4);
            String cm = s.substring(4, 6);
            String cd = s.substring(6, 8);

            int sy = 0, sm = 0, sd = 0;

            for (int j = 0; j < 4; j++) {
                int diff = Y[j] - (cy.charAt(j) - '0');
                sy += diff * diff;
            }
            for (int j = 0; j < 2; j++) {
                int diff = M[j] - (cm.charAt(j) - '0');
                sm += diff * diff;
            }
            for (int j = 0; j < 2; j++) {
                int diff = D[j] - (cd.charAt(j) - '0');
                sd += diff * diff;
            }

            int value = sy * sm * sd;

            if (value > best || (value == best && (answer.isEmpty() || s.compareTo(answer) < 0))) {
                best = value;
                answer = s;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}