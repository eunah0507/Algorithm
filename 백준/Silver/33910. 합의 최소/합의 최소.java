import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = num - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1];
            }
        }

        long sum = 0;
        for (int i = 0; i < num; i++) {
            sum += arr[i];
        }

        sb.append(sum);
        System.out.print(sb.toString());
    }
}
