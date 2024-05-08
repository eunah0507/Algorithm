import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 밀려 넘어지는 첨탑의 높이가 바로 그다음 첨탑의 높이보다 클 때만 그다음 첨탑도 밀려 넘어진다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int[] high = new int[num + 1];
        // 처음엔 밀고 시작해야하니까 1을 준다.
        int answer = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            high[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < num; i++) {
            if (high[i] <= high[i+1]){
                answer++;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}