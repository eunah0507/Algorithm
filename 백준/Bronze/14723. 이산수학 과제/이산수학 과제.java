import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int num = Integer.parseInt(br.readLine());
		int numA = 0;
        int numB = 1;
        int numC = 1;

		for (int i = 0; i < 1001; i++) {
			if ((numA <= num) && (num < numB)) 
				break;
			numA = numB;
			numB += numC++;
		}

		int result1 = numC - 1;
		int result2 = 1;

		for (int i = 0; i < (num - numA); i++) {
			result1--;
			result2++;
		}

		sb.append(result1).append(" ").append(result2);
		System.out.println(sb.toString());
	}
}
