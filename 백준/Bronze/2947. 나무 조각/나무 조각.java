import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int[] arr = new int[5];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		while (true) {
			boolean changed = false;
			for (int i = 0; i < 4; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					changed = true;
					for (int j = 0; j < 5; j++) {
						sb.append(arr[j]).append(" ");
					}
					sb.append("\n");
				}
			}
			if (!changed) break;
		}

		System.out.print(sb.toString());
	}
}
