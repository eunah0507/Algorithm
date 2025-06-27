import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] hay = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            hay[i] = Integer.parseInt(br.readLine());
            sum += hay[i];
        }

        int avg = sum / n;
        int moves = 0;

        for (int i = 0; i < n; i++) {
            if (hay[i] > avg) {
                moves += (hay[i] - avg);
            }
        }

        System.out.println(moves);
    }
}
