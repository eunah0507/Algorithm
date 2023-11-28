import java.util.Iterator;
import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {

		// 한 개의 문자열을 입력 받고, 특정 문자를 입력 받아 해당 특정 문자가 입력 받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성

		// 1. 테스트케이스 String으로 받아온다.
		// 2. Char 받아온다.
		// 3. 몇 개인지 받을 int 받아온다.
		// 4. String 케이스와 Char 값을 대문자로 변환해준다.
		// 5. for문 안에 if문을 돌려 찾을때마다 int값을 ++해준다.

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char c = sc.next().charAt(0);
		int answer = 0;

		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		
	//	System.out.println(str + " " + c);
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
