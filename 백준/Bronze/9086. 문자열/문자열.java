import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 문제
		
		// 1. 테스트케이스 int를 받아온다.
		// 2. 테스트케이스 String을 받아온다.
		// 3. string.charAt(0)과 string.charAt(string.length()-1)를 받아온다.
		// 4. String answer에 += 해준다.
		// 5. 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		for (int j = 0; j < i; j++) {
			String str = sc.next();
			String answer = "";
			
			answer = "" + str.charAt(0) + str.charAt(str.length()-1);
			System.out.println(answer);
		}
		
	}
}
