import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {

		// 소문자는 대문자로, 대문자는 소문자로 출력하라.

		// 테스트케이스 String을 받아온다.
		// for문 안에 if문을 돌려서 소문자인 경우 대문자로 출력한다.
		// else문으로 대문자인 경우 소문자를 출력한다.

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		String answer = "";

		for (char i : str.toCharArray()) {
			if (Character.isLowerCase(i)) {
				answer += Character.toUpperCase(i);
			} else {
				answer += Character.toLowerCase(i);
			}

		}
		System.out.println(answer);
	}
}
