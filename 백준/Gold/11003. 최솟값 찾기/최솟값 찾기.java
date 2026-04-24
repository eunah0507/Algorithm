import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[] values = new int[n];
        int[] indexes = new int[n];
        int front = 0;
        int back = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            while (front < back && values[back - 1] > num) {
                back--;
            }

            values[back] = num;
            indexes[back] = i;
            back++;

            if (indexes[front] <= i - l) {
                front++;
            }

            sb.append(values[front]).append(' ');
        }

        System.out.print(sb.toString());
    }
}