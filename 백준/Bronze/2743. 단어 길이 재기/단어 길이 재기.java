import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 문제
		
		// 1. 테스트케이스 String을 받아온다.
		// 2. int cnt 를 받아온다.
		// 3. cnt에 length()를 받아온다.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int cnt = str.length();
		
		System.out.println(cnt);
		
	}
}
