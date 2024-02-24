import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // 3으로 나눠지면 3으로 나눈다.
        // 2로 나눠지면 2로 나눈다.
        // 둘 다 안되면 1을 뺀다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        // 1부터 시작해야해서 배열 크기를 +1 한다.
        int[] count = new int[num + 1];

        count[1] = 0;

        for (int i = 2; i <= num; i++) {
            // count[i] 는 coutn[i-1]의 방법에서 1을 더하기만 하면 되니까 최대값으로 지정한다.
            count[i] = count[i - 1] + 1;
            // 2,3의 최대공배수이기 때문에 이 값을 맨 처음 둔다.
            // 두 가지 경우의 수를 비교하기 위해서이다.
            if (i % 6 == 0) {
                count[i] = Math.min(count[i / 3] + 1, Math.min(count[i / 2] + 1, count[i]));
            // 6이 안된다면 2나 3으로 비교하기 시작한다. 두 else if는 순서가 바뀌어도 상관X
            } else if (i % 3 == 0) {
                count[i] = Math.min(count[i], (count[i / 3] + 1));
            } else if (i % 2 == 0) {
                count[i] = Math.min(count[i], (count[i / 2] + 1));
            }
        }
        
        // 배열은 0부터 시작하기 때문에 +1 크기로 했고,
        // for문은 2부터 돌아가니까 그냥 count[num]값을 출력하면 된다.
        sb.append(count[num]);
        
        System.out.println(sb.toString());
    }
}