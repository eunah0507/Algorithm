import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 1. 테스트 케이스들을 입력받는다.
        // 2. 원래대로 주문했을 때의 가격을 입력받는다.
        // 3. 반반 치킨으로 각각 주문했을 때를 입력받는다.
        // 3-1. 주문해야하는 양념, 후라이드 치킨 중, 적은 수를 구한다.
        // 3-2. 적은 수가 양념인지 후라이드인지에 따라 값을 따로 구한다.
        // 4. 반반으로 시켰을 때의 가격과 원래 가격을 비교해 적은 수를 출력
        // 주의: 반반의 가격이 후라이드나 양념의 절반가격보다 싸다면 그걸 주의한다.
        int yang = Integer.parseInt(st.nextToken());
        int fried = Integer.parseInt(st.nextToken());
        int half = Integer.parseInt(st.nextToken());
        int doubleHalf = half * 2;
        int plzYang = Integer.parseInt(st.nextToken());
        int plzFried = Integer.parseInt(st.nextToken());

        int basic = (yang * plzYang) + (fried * plzFried);
        int halfCount = 0;
        int answer = 0;

        int min = Math.min(plzFried, plzYang);

        if (min == plzFried) {
            if (doubleHalf < yang) {
                halfCount = (half * plzFried) * 2 + ((plzYang - min) * half * 2);
            } else {
                halfCount = (half * plzFried) * 2 + (plzYang - min) * yang;
            }
        } else {
            if (doubleHalf < fried) {
                halfCount = (half * plzYang) * 2 + ((plzFried - min) * half * 2);
            } else {
                halfCount = (half * plzYang) * 2 + (plzFried - min) * fried;
            }
        }

        answer = Math.min(basic, halfCount);

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
