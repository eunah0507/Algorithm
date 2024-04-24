import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 0초에서의 분수 높이 x, 그리고 n초가 주어진다
        // n초에서의 분수 높이를 구하는 문제
        // n이 짝수 : (x/2)+6 , 홀수 : (2*x)+6

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int high = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        for (int i = 0; i < second; i++) {
            if (high % 2 == 0) {
                high = ((high / 2) ^ 6);
            } else {
                high = ((high * 2) ^ 6);
            }
        }


        sb.append(high);
        System.out.println(sb.toString());
    }
}