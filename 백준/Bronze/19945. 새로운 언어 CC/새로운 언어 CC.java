import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(br.readLine());
		int answer = 0;

		if (num < 0) {
			answer = 32;
		} else {
			if (num == 0) {
				answer = 1;
			} else {
				while (num > 0) {
					num >>= 1;
					answer++;
				}
			}
		}

		sb.append(answer);
		System.out.println(sb.toString());
	}
}
