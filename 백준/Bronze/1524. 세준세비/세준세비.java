import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			br.readLine();
            
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int Smax = 0;
			int Bmax = 0;

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				Smax = Math.max(Smax, Integer.parseInt(st.nextToken()));
			}

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				Bmax = Math.max(Bmax, Integer.parseInt(st.nextToken()));
			}

			if (Smax >= Bmax) sb.append("S\n");
			else sb.append("B\n");
		}

		System.out.print(sb.toString());
	}
}
