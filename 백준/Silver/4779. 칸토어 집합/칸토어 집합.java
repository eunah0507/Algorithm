import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static char[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input;

        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            int length = (int) Math.pow(3, n);

            arr = new char[length];

            for (int i = 0; i < length; i++) {
                arr[i] = '-';
            }

            cantor(0, length);

            sb.append(arr).append('\n');
        }

        System.out.print(sb.toString());
    }

    private static void cantor(int start, int length) {
        if (length == 1) {
            return;
        }

        int next = length / 3;

        for (int i = start + next; i < start + next * 2; i++) {
            arr[i] = ' ';
        }

        cantor(start, next);
        cantor(start + next * 2, next);
    }
}