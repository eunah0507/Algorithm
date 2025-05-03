import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String number = br.readLine();
			Set<Character> digits = new HashSet<>();

			for (char c : number.toCharArray()) {
				digits.add(c);
			}

			sb.append(digits.size()).append('\n');
		}

		System.out.print(sb.toString());
	}
}
