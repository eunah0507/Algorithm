import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 상근이네 할머니가 쓰시는 구식 다이얼 버튼 누르는 시간 출력하는 문제

		// 1. 테스트케이스 String을 받아온다.
		// 2. String을 int로 변환한다??????
		// 3. for문을 돌려서 charAt해서 각 값에 숫자값을 넣어준다.??
		// 4. 더해준다.
		// 문자열문제는 대체적으로 아주 얍삽하고 비열한 문제만 있다.

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int second = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			switch (c) {
			case 'A':
			case 'B':
			case 'C':
				second += 3;
				break;
			case 'D':
			case 'E':
			case 'F':
				second += 4;
				break;
			case 'G':
			case 'H':
			case 'I':
				second += 5;
				break;
			case 'J':
			case 'K':
			case 'L':
				second += 6;
				break;
			case 'M':
			case 'N':
			case 'O':
				second += 7;
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				second += 8;
				break;
			case 'T':
			case 'U':
			case 'V':
				second += 9;
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				second += 10;
				break;
			case '+':
			case '-':
			case '*':
			case '/':
				second += 11;
				break;
			}
		}
		System.out.println(second);

	}
}