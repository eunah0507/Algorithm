import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        // 1. bnp = 사두고 기도한다(buy and pray)
        // 2. timing~~ = 타이밍 맞춰서 사고 판다

		int cash = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] prices = new int[14];
		for (int i = 0; i < 14; i++) {
			prices[i] = Integer.parseInt(st.nextToken());
		}

		int bnpCash = cash;
		int bnpStock = 0;
		for (int i = 0; i < 14; i++) {
			if (bnpCash >= prices[i]) {
				int buy = bnpCash / prices[i];
				bnpStock += buy;
				bnpCash -= buy * prices[i];
			}
		}
		int bnpAsset = bnpCash + bnpStock * prices[13];

		int timingCash = cash;
		int timingStock = 0;
		for (int i = 3; i < 14; i++) {
			if (prices[i - 3] < prices[i - 2] && prices[i - 2] < prices[i - 1]) {

				timingCash += timingStock * prices[i];
				timingStock = 0;
			} else if (prices[i - 3] > prices[i - 2] && prices[i - 2] > prices[i - 1]) {

				if (timingCash >= prices[i]) {
					int buy = timingCash / prices[i];
					timingStock += buy;
					timingCash -= buy * prices[i];
				}
			}
		}
		int timingAsset = timingCash + timingStock * prices[13];

		if (bnpAsset > timingAsset) {
            sb.append("BNP");
        }else if (timingAsset > bnpAsset) {
            sb.append("TIMING");
        } else {
            sb.append("SAMESAME");
        }
        
		System.out.println(sb.toString());
	}
}
