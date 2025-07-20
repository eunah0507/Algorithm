import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int first = arr[0];
        boolean isMin = true;
        boolean isMax = true;

        for (int i = 1; i < n; i++) {
            if (arr[i] < first) {
                isMin = false;
            }
            if (arr[i] > first) {
                isMax = false;
            }
        }

        if (isMin) {
            sb.append("ez");
        } else if (isMax) {
            sb.append("hard");
        } else {
            sb.append("?");
        }

        System.out.println(sb.toString());
    }
}
