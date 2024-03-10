import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // 1. 무조건 같은 숫자의 카드 3장이 제일 좋다
        // 2. 같은 숫자 카드 2장이 좋다
        // 3. 같은 숫자 카드는 수가 큰게 좋다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cardA = Integer.parseInt(st.nextToken());
        int cardB = Integer.parseInt(st.nextToken());
        int cardC = 0;

        if (cardA == cardB){
            cardC = cardA;
        }else {
            cardC = Math.max(cardA, cardB);
        }

        sb.append(cardC);
        System.out.println(sb.toString());

    }
}