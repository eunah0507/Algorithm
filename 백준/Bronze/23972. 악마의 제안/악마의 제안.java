import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 악마에게 K원 지불하면, 지불하고 남은 금액을 N배로 만들어준다고 한다.
        // 자신이 최소 몇 원 가지고 있을 때 손해를 안볼지 알고싶다.
        // 아니.. 그냥 주는대로 불려준다그러지 뭘 또 수학적으로 어쩌구저쩌구.. 쩨쩨한악마..

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long devil = Long.parseLong(st.nextToken());
        long times = Long.parseLong(st.nextToken());
        long money = 0;

        // 가진돈 - 지불할 돈 * 배수 = 가진 돈
        if (times == 1){
            money = -1L;
        }else{
            money = (devil * times) / (times - 1L);

            if ((devil * times) % (times - 1L) != 0L){
                money += 1L;
            }
        }

        sb.append(money);
        System.out.println(sb.toString());
    }
}
