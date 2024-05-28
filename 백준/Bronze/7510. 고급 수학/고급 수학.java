import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[3];

        for(int i = 1; i <= num; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            sb.append("Scenario #").append(i).append(":").append("\n");

            Arrays.sort(arr);

            if((arr[0] * arr[0]) + (arr[1] * arr[1]) == (arr[2] * arr[2])) {
                sb.append("yes").append("\n");
            }else {
                sb.append("no").append("\n");
            }
            sb.append("\n");
        }
            System.out.println(sb.toString());

    }
}
