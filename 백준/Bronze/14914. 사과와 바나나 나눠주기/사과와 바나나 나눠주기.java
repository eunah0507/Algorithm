import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 조건 1. 잘라서 주지 않고 모두 공평하게 나눠준다.

        StringTokenizer st = new StringTokenizer(br.readLine());
        int apple = Integer.parseInt(st.nextToken());
        int banana = Integer.parseInt(st.nextToken());

        int min = Math.min(apple, banana);

        for (int i = 1; i <= min; i++) {
            if (apple % i == 0 && banana % i == 0){
                sb.append(i).append(" ").append(apple / i).append(" ").append(banana / i).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}