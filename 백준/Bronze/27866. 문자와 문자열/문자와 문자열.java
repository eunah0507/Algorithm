import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 문제
		
		// 1. 테스트케이스 String을 받아온다.
		// 2. 테스트케이스 int i를 받아온다.
		// 3. charAt(i)를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int i = sc.nextInt();
		char answer = str.charAt(i-1);
		
		System.out.println(answer);
		
	}
}