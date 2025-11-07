import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = s.charAt(i) - '0';
        }

        char[][] out = new char[4][9];
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 9; c++) {
                out[r][c] = ' ';
            }
        }

        int[] cols = {0, 2, 6, 8};
        for (int d = 0; d < 4; d++) {
            int v = digits[d];
            for (int b = 0; b < 4; b++) {
                int row = 3 - b;
                out[row][cols[d]] = ((v >> b) & 1) == 1 ? '*' : '.';
            }
        }

        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 9; c++) {
                sb.append(out[r][c]);
            }
            if (r < 3) sb.append('\n');
        }

        System.out.print(sb.toString());
    }
}
