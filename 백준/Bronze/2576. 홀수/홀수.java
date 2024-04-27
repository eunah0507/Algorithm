import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 7개의 자연수가 주어질 때, 홀수를 찾아 그 합을 구하고, 홀수들의 합을 구한다.
        // for문을 돌려 값을 구한다.
        // if문을 써서 홀수인 경우 새로운 배열에 추가하고, 더한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[7];
        int[] even = new int[7];
        int sum = 0;

        for (int i = 0; i < 7; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (arr[i] % 2 != 0) {
                even[i] = arr[i];
                sum += arr[i];
            }else{
                // arr[i]가 짝수라면 그대로 지나가지 않는다.
                // 지나가면 0이 들어가서 최소값을 구할 수 없으므로 최대값을 넣어준다.
                even[i] = Integer.MAX_VALUE;
            }
        }

        Arrays.sort(even);

        if (sum == 0) {
            sb.append(-1);
        } else {
            sb.append(sum).append("\n").append(even[0]);

        }

        System.out.println(sb.toString());
    }
}