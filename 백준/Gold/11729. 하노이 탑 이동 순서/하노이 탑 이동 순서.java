import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = Main.sb;

        int n = Integer.parseInt(br.readLine());

        sb.append((1 << n) - 1).append('\n');
        hanoi(n, 1, 2, 3);

        System.out.print(sb.toString());
    }

    private static void hanoi(int n, int from, int temp, int to) {
        if (n == 1) {
            sb.append(from).append(' ').append(to).append('\n');
            return;
        }

        hanoi(n - 1, from, to, temp);
        sb.append(from).append(' ').append(to).append('\n');
        hanoi(n - 1, temp, from, to);
    }
}