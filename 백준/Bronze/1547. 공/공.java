import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 컵의 위치를 바꾼 횟수 M이 주어진다. (M >= 50)
        // 컵의 위치를 바꾼 방법 X와 Y가 주어진다 (x번 <> y번 && x,y <= 3)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int ball = 1;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 공의 위치를 바뀐다면, 공의 위치를 새로 저장한다.
            if (x == ball){
                ball = y;
            }else if(y == ball){
                ball = x;
            }
        }

        sb.append(ball);
        System.out.println(sb.toString());
    }
}