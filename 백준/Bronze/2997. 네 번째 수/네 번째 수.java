import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // 구해야하는 네 번째 수는 어쨌든 등차수열이다.
        // 구하는 수는 몇 번째인지 모른다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];

        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int commonDifference1 = arr[1] - arr[0];
        int commonDifference2 = arr[2] - arr[1];
        int answer = 0;

        if (commonDifference1 == commonDifference2) {
            answer = arr[2] + commonDifference1;
        } else if (commonDifference1 > commonDifference2) {
            answer = arr[0] + commonDifference2;
        } else {
            answer = arr[1] + commonDifference1;
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }
}
