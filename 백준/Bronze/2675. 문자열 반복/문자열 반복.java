import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 문제
		
		// 1. 테스트케이스 int를 받아오고
		// 2. 반복문을 돌려서 그 안에서 새로운 테스트케이스 int와 String을 받아온다.
		// 3. String answer를 새로 받아온다.
		// 4. for문 안에 다시 for문을 돌려서 테스트케이스 String을 int만큼 반복해준다.
		// 5. 출력한다.

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			int n = sc.nextInt();
			String str = sc.next();
			String answer = "";
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < n; k++) {
					answer += str.charAt(j);
				}
			}
			System.out.println(answer);
		}
	}
}
