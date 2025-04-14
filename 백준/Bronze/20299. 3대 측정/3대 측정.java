import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int teamMin = Integer.parseInt(st.nextToken());
		int perMin = Integer.parseInt(st.nextToken());

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			if (a + b + c >= teamMin && a >= perMin && b >= perMin && c >= perMin) {
				cnt++;
				sb.append(a).append(" ").append(b).append(" ").append(c).append(" ");
			}
		}
		System.out.println(cnt);
		System.out.println(sb.toString());
	}
}
