import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int A = 0;
		int B = 0;
		int C = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		if (n == 2) {
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			for (int i = 1; i <= Math.min(A, B); i++) {
				if (A % i == 0 && B % i == 0) {
					sb.append(i).append('\n');
				}
			}
		} else {
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			for (int i = 1; i <= Math.min(A, Math.min(B, C)); i++) {
				if (A % i == 0 && B % i == 0 && C % i == 0) {
					sb.append(i).append('\n');
				}
			}
		}
		
		System.out.print(sb.toString());
	}
}
