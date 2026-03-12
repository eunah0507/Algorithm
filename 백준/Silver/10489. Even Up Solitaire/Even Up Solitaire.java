import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] stack = new int[n];
        int size = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int parity = Integer.parseInt(st.nextToken()) % 2;

            if (size > 0 && stack[size - 1] == parity) {
                size--;
            } else {
                stack[size++] = parity;
            }
        }

        sb.append(size);
        System.out.print(sb.toString());
    }
}