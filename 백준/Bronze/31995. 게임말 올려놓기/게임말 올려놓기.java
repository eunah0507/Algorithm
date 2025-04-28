import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		int result = 0;
		if (N >= 2 && M >= 2) {
			result = 2 * (N - 1) * (M - 1);
		}

		sb.append(result);
		System.out.println(sb.toString());
	}
}
