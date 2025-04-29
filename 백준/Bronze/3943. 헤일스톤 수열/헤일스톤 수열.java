import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			long n = Long.parseLong(br.readLine());
			long max = n;

			while (n != 1) {
				if (n % 2 == 0) {
					n /= 2;
				} else {
					n = n * 3 + 1;
				}
				if (n > max) {
					max = n;
				}
			}

			sb.append(max).append('\n');
		}

		System.out.print(sb.toString());
	}
}
