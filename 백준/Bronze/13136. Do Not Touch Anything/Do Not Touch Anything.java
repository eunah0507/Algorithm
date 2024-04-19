import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // (R / N) , (C / N) 따로 구한다
        // 각 값이 나머지가 있을 때에는 +1 한다.
        // 그 후 곱한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long R = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        long N = Long.parseLong(st.nextToken());

        long garo = 0;
        long sero = 0;

        if (R % N == 0){
            garo = R / N;
        }else{
            garo = (R/N) + 1;
        }

        if (C % N == 0){
            sero = C / N;
        }else{
            sero = (C/N) + 1;
        }

        long answer = garo * sero;
        sb.append(answer);
        System.out.println(sb.toString());
    }
}