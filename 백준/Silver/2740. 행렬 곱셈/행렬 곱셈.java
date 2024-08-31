import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int aRow = Integer.parseInt(st.nextToken());
        int aCol = Integer.parseInt(st.nextToken());
        int[][] a = new int[aRow][aCol];
        for (int i = 0; i < aRow; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < aCol; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        int bRow = Integer.parseInt(st.nextToken());
        int bCol = Integer.parseInt(st.nextToken());
        int[][] b = new int[bRow][bCol];
        for (int i = 0; i < bRow; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < bCol; j++) {
                b[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] answer = new int[aRow][bCol];

        for(int i = 0; i < aRow; i++) {
            for(int j = 0; j < bCol; j++) {

                for(int k = 0; k < aCol; k++) {
                    answer[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int i = 0; i < aRow; i++) {
            for (int j = 0; j < bCol; j++) {
                sb.append(answer[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb.toString());


    }
}
