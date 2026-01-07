import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[8];
        
        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < 8; i++) {
            if (arr[i] != i + 1) {
                ascending = false;
            }
            if (arr[i] != 8 - i) {
                descending = false;
            }
        }

        if (ascending) {
            sb.append("ascending");
        } else if (descending) {
            sb.append("descending");
        } else {
            sb.append("mixed");
        }

        System.out.print(sb.toString());
    }
}
