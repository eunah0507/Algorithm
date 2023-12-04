import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 문제
		
		// 1. 테스트케이스 String을 받아온다. 
		// 2. 새로운 char에 charAt으로 0번째 문자를 받아온다.
		// 3. 새로운 int에 charAt값을 넣어준다.
		// 4. 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char c = str.charAt(0);
		int answer = c;
		
		// int answer = sc.next().charAt(0);
		
		System.out.println(answer);
		
	}
}
