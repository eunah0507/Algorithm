import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] year = new int[3];
        int[] solved = new int[3];
        String[] surname = new String[3];

        for (int i = 0; i < 3; i++) {
            String[] input = br.readLine().split(" ");
            solved[i] = Integer.parseInt(input[0]);
            year[i] = Integer.parseInt(input[1]);
            surname[i] = input[2];
        }

        Integer[] yearMod = { year[0] % 100, year[1] % 100, year[2] % 100 };
        Arrays.sort(yearMod);
        for (int y : yearMod) {
            if (y < 10) sb.append("0");
            sb.append(y);
        }
        sb.append("\n");

        Integer[] idx = { 0, 1, 2 };
        Arrays.sort(idx, (a, b) -> solved[b] - solved[a]);
        for (int i = 0; i < 3; i++) {
            sb.append(surname[idx[i]].charAt(0));
        }

        System.out.print(sb.toString());
    }
}
