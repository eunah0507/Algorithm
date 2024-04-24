import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 주어진 레벨을 구간으로 나눠 출력하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            int level = Integer.parseInt(st.nextToken());
            int part = 0;

            if (level == 300){
                part = 1;
            }else if(level >= 275){
                part = 2;
            }else if (level >= 250){
                part = 3;
            }else{
                part = 4;
            }

            sb.append(part).append(" ");
        }

        System.out.println(sb.toString());
    }
}