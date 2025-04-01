import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(br.readLine());

		String[] tokens = br.readLine().split(" ");
		int p = Integer.parseInt(tokens[0]);
		int q = Integer.parseInt(tokens[1]);
		int r = Integer.parseInt(tokens[2]);
		int s = Integer.parseInt(tokens[3]);

		int[] a = new int[num + 1];
		a[1] = Integer.parseInt(br.readLine());

		for (int i = 2; i <= num; i++) {
			if (i % 2 == 0) {
				a[i] = p * a[i / 2] + q;
			} else {
				a[i] = r * a[i / 2] + s;
			}
		}

		int answer = 0;
		for (int i = 1; i <= num; i++) {
			answer += a[i];
		}

		sb.append(answer);
		System.out.println(sb.toString());
	}
}
