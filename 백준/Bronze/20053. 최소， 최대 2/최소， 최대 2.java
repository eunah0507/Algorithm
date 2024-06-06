import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 최소값과 최대값 구하기
        // 배열로 정렬한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int testCaset = Integer.parseInt(br.readLine());
            int [] arr = new int[testCaset];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < testCaset; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);
            sb.append(arr[0]).append(" ").append(arr[testCaset-1]).append("\n");
        }

        System.out.println(sb.toString());
    }
}
