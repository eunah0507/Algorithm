import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] lis = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            int left = 0;
            int right = size;

            while (left < right) {
                int mid = (left + right) / 2;

                if (lis[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            lis[left] = num;

            if (left == size) {
                size++;
            }
        }

        sb.append(size);
        System.out.print(sb.toString());
    }
}