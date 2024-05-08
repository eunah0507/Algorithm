import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 사과개수는 학교마다 다르고, 학생 수도 다르다.
        // 남는 사과를 최소로 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트케이스를 입력받는다.
        int num = Integer.parseInt(br.readLine());
        // 답을 출력할 변수를 만든다.
        int answer = 0;
        
        // for문을 num 만큼 돌린다.
        // 그 속에서 학생 수와 사과 개수를 입력받고 나머지를 answer에 중첩한다.
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int student = Integer.parseInt(st.nextToken());
            int apple = Integer.parseInt(st.nextToken());

            answer += apple % student;
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}