import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
		String s = br.readLine();
		char[] pattern = {'K', 'O', 'R', 'E', 'A'};
		int index = 0;
		int length = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == pattern[index]) {
				length++;
				index++;
			}
			if (index == 5) index = 0;
		}
           
        sb.append(length);
		System.out.println(sb.toString());
	}
}
