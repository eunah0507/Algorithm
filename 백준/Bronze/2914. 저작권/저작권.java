import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 창영이 앨범에 수록된 곡에 포함되어있는 멜로디 갯수 / 앨범에 수록된 곡의 갯수
        // 894 / 38 = 24 > A / B = C 로 나눌 때, B와 C가 주어진다. A를 구하라
        // A / B = C, A = B * C, B = C / A

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int song = Integer.parseInt(st.nextToken());
        int average = Integer.parseInt(st.nextToken());
        // 무조건 C(=average)가 올랐다는 전제 하에 -1을 해서 빼주고, 올림 가능하게끔 +1한다.
        int answer = song * (average - 1) + 1;

        sb.append(answer);
        System.out.println(sb.toString());

    }
}