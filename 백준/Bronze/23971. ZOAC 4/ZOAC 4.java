import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 테이블이 W개씩 H행에 걸쳐 있을 때
        // 세로로 N칸, 가로로 M칸 이상 비우고 앉아야 한다.
        // 최대 몇 명 수용 가능한가?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int garo = 0;
        int sero = 0;

        for (int i = 0; i < h; i+=(n+1)) {
            garo++;
        }

        for (int i = 0; i < w; i+=(m+1)) {
            sero++;
        }

        int answer = garo * sero;

        sb.append(answer);
        System.out.println(sb.toString());
    }
}