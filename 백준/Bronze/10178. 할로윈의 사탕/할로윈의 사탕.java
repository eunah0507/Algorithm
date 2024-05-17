import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 사이가 좋지 않은 한신이네 형제에게 사탕을 나눠준다.
        // 공평하게 몇 개씩 나눠주고, 나머지가 몇 개가 남는지 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int answer = 0;
        int remain = 0;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int candy = Integer.parseInt(st.nextToken());
            int people = Integer.parseInt(st.nextToken());
            answer = (candy / people);
            remain = (candy % people);

            sb.append("You get ").append(answer).append(" piece(s) and your dad gets ").append(remain).append(" piece(s).").append("\n");
        }

        System.out.println(sb.toString());
    }
}
