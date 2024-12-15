import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int t = 0; t < testCase; t++) {
            int num = Integer.parseInt(br.readLine()); // 각 테스트 케이스의 아이템 수

            double minPricePerGram = Double.MAX_VALUE;
            int resultPrice = 0;

            for (int i = 0; i < num; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int gram = Integer.parseInt(st.nextToken());
                int price = Integer.parseInt(st.nextToken());

                double pricePerGram = (double) price / gram; // gram당 가격 계산

                // 최적화된 가격 비교 로직
                if (pricePerGram < minPricePerGram) {
                    minPricePerGram = pricePerGram;
                    resultPrice = price; // gram당 가격이 가장 낮은 상품의 price 저장
                } else if (pricePerGram == minPricePerGram && price < resultPrice) {
                    // gram당 가격이 동일한 경우, price가 더 낮은 값을 선택
                    resultPrice = price;
                }
            }

            sb.append(resultPrice).append("\n");
        }

        System.out.println(sb.toString());
    }
}
