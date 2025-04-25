import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static boolean[] isPrime = new boolean[601];
	static List<Integer> primeDistances = new ArrayList<>();
	static int N;
	static boolean[] used;
	static int[] perm;
	static boolean found;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		initPrimes();

		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			N = Integer.parseInt(br.readLine());
			used = new boolean[N + 1];
			perm = new int[N];
			found = false;

			backtrack(0);

			if (!found) {
				sb.append("NO\n");
			}
		}
		System.out.print(sb.toString());
	}

	static void initPrimes() {
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime[i]) {
				for (int j = i * 2; j < isPrime.length; j += i) {
					isPrime[j] = false;
				}
			}
		}
		for (int i = 2; i <= 300; i++) {
			if (isPrime[i]) {
				primeDistances.add(i);
			}
		}
	}

	static void backtrack(int idx) {
		if (found) return;
		if (idx == N) {
			if (checkBeautiful()) {
				sb.append("YES\n");
				for (int i = 0; i < N; i++) sb.append(perm[i]).append(" ");
				sb.append("\n");
				found = true;
			}
			return;
		}
		for (int i = 1; i <= N; i++) {
			if (!used[i]) {
				perm[idx] = i;
				used[i] = true;
				backtrack(idx + 1);
				used[i] = false;
			}
		}
	}

	static boolean checkBeautiful() {
		for (int i = 0; i < N; i++) {
			for (int j : primeDistances) {
				if (i + j < N) {
					if (!isPrime[Math.abs(perm[i] - perm[i + j])]) return false;
				}
			}
		}
		return true;
	}
}
