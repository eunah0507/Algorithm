import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(br.readLine());

		String[] aTokens = br.readLine().split(" ");
		String[] bTokens = br.readLine().split(" ");
		int answer = 0;
		int unregistered = 0;

        
		for (int i = 0; i < num; i++) {
			int interest = Integer.parseInt(aTokens[i]);
			int isRegistered = Integer.parseInt(bTokens[i]);

			answer += interest;
			if (isRegistered == 0) {
				unregistered += interest;
			}
		}

		sb.append(answer).append('\n').append(unregistered);
		System.out.println(sb.toString());
	}
}
