import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 문제

		// 1. 테스트케이스 String을 받아온다.
		// 2. for문을 절반만 돌려서 앞,뒤로 비교해준다.
		// 3. charAt()을 통해 한 글자씩 뺀다.
		// 4. 펠린드롬이면 1을 출력, 아니면 0을 출력한다.

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		StringBuffer sb = new StringBuffer(str);
		
		String reverse = sb.reverse().toString();
		
		if (str.equals(reverse)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}