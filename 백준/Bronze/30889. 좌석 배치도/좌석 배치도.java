import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[][] arr = new char[10][21];

        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= 20 ; j++) {
                arr[i][j] = '.';
            }
        }

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int r = str.charAt(0) - 'A';
            int c = Integer.parseInt(str.substring(1));
            arr[r][c] = 'o';
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= 20 ; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb.toString());
    }
}
