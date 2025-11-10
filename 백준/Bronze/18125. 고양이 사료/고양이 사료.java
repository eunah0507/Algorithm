import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        int[][] foodPattern = new int[height][width];
        boolean canEat = true;

        for (int i = 0; i < height; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < width; j++) {
                foodPattern[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int x = 0; x < width; x++) {
            st = new StringTokenizer(br.readLine());
            for (int y = height - 1; y >= 0; y--) {
                int n = Integer.parseInt(st.nextToken());
                if (foodPattern[y][x] != n) {
                    canEat = false;
                    break;
                }
            }
            if (!canEat) break;
        }

        if (canEat) {
            sb.append("|>___/|        /}\n")
              .append("| O < |       / }\n")
              .append("(==0==)------/ }\n")
              .append("| ^  _____    |\n")
              .append("|_|_/     ||__|");
        } else {
            sb.append("|>___/|     /}\n")
              .append("| O O |    / }\n")
              .append("( =0= )\"\"\"\"  \\\n")
              .append("| ^  ____    |\n")
              .append("|_|_/    ||__|");
        }

        System.out.print(sb.toString());
    }
}
