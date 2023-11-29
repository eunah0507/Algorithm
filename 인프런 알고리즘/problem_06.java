import java.util.Scanner;

public class problem_06 {
	public static void main(String[] args) {
		
		// 문자열이 회문 문자열이면 yes, 아니면 no 출력
		// 회문 문자열이란 ? 앞에서 읽을때나 뒤에서 읽을 때 같은 문자열
		
		// 1. 테스트케이스 string을 받아온다.
		// 2. 대소문자를 구분하지 않으므로 모두 대문자로 변환한다.
		// 3. 짝수일 때는 서로 맞는지 비교한다. (홀수일 때는 비교할 필요가 없다. 비교대상 x)
		// 4. for문을 i/2만돌린다. 그리고 뒤에 문자와 비교해서 아닐 때에는 NO를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String answer = "";
		int length = str.length();
		
		str = str.toUpperCase();
		
		for (int i = 0; i < length/2; i++) {
			if (str.charAt(i)!=str.charAt(length-i-1)) { //-1을 하는 이유는 0번부터 세기 때문이다.
				answer = "NO";
				break;
			}else {
				answer = "YES";
			}
		}
		System.out.println(answer);
	}
}
