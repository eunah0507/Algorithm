import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String subject = st.nextToken();
			int score = Integer.parseInt(st.nextToken());
			map.put(subject, score);
		}

		int base = 0;
		for (int i = 0; i < K; i++) {
			String colSubject = br.readLine();
			base += map.get(colSubject);
			map.remove(colSubject);
			M--;
		}

		List<Integer> list = new ArrayList<>(map.values());
		Collections.sort(list);

		int min = base;
		int max = base;
		int j = list.size() - 1;

		for (int i = 0; i < M; i++, j--) {
			min += list.get(i);
			max += list.get(j);
		}

		sb.append(min).append(" ").append(max);
		System.out.println(sb.toString());
	}
}
