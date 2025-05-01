import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int complement = ~n + 1;

		int diff = n ^ complement;
		int count = Integer.bitCount(diff);

		sb.append(count);
		System.out.println(sb.toString());
	}
}
