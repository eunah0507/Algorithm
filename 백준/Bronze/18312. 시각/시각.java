import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // Q. 00시 00분 00초 > N시 59분 59초까지 K가 포함되는 수 구하기
        // 1. N과 K를 입력받는다.
        // 2. 시, 분, 초 3중 for문을 돌리며 포함 시 answer++
        // 2-1. k = 3일때 30도 포함이고 13도 포함이므로 contains() 사용을 위해 String변환한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int answer = 0;

        String time = String.valueOf(k);

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= 59; j++) {
                for (int l = 0; l <= 59; l++) {
                    // 하나의 시간으로 변환한다. 그 후 contains() 사용
                    String str = String.format("%02d%02d%02d", i, j, l);

                    if (str.contains(time)){
                        answer++;
                    }
                }
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }
}
