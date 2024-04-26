import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 영식 요금제 : 30초마다 10원씩 부가
        // 민식 요금제 : 60초마다 15원씩 부가
        // 동호가 어느 요금제를 이용하는게 더 좋은지?
        // Y or M 출력 후, 요금 얼마 나왔는지 구하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = 0;
        int m = 0;

        for (int i = 0; i < num; i++) {
            int call = Integer.parseInt(st.nextToken());
            int copyCall = call;

            while (true){
                if (call < 0){
                    break;
                }else {
                    y += 10;
                    call -= 30;
                }
            }

            while (true){
                if (copyCall < 0){
                    break;
                }else{
                    m += 15;
                    copyCall -= 60;
                }
            }
        }

        int answer = Math.min(y, m);

        if (y == m){
            sb.append("Y M " + y);
        }else if(answer == y){
            sb.append("Y " + y);
        }else{
            sb.append("M " + m);
        }

        System.out.println(sb.toString());
    }
}