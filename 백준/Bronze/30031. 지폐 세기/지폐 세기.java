import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 각 지폐의 세로 길이는 68mm
        // 천원 가로 136, 오천원 142, 만원 148, 오만원 154

        // for문을 테스트케이스만큼 돌린다.
        // for문 안에서 세로 길이와 가로 길이를 각각 입력받는다
        // if문을 써서 가로 길이에 따라 지폐 금액을 알아내고, 더한다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int money = 0;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int garo = Integer.parseInt(st.nextToken());
            int sero = Integer.parseInt(st.nextToken());

            if (garo == 136){
                money += 1000;
            }else if(garo == 142){
                money += 5000;
            }else if(garo == 148){
                money += 10000;
            }else if(garo == 154){
                money += 50000;
            }
        }

        sb.append(money);
        System.out.println(sb.toString());
    }
}