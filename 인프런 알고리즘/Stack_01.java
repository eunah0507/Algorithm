import java.util.Scanner;
import java.util.Stack;

public class Stack_01 {
	public static void main(String[] args) {
		// 올바른 ()쌍으로 끝나면 YES, 아니면 NO

		// 1. 테스트케이스 String을 받는다
		// 2. 답을 출력할 answer변수를 만든다.
		// 3. stack을 만든다.
		// 4. forEach문을 돌려서 값을 채운다.
		// 5. if문을 써서 '('면 stack에 add해준다.
		// 6. '('가 아니라면 remove해주는데,
		// stack이 비어있다면 바로 answer를 NO로 바꿔 출력한다.
		// 7. 모든 값을 stack에 넣었는데 stack이 비어있지 않다면 NO

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		String answer = "YES";

		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {
			if (ch == '(') {
				stack.add(ch);
			} else {
				if (stack.isEmpty()) {
					answer = "NO";
					break;
				} else {
					stack.pop();
				}
			}
		}
		
		if (!stack.isEmpty()) {
			answer = "NO";
		}

		System.out.println(answer);
	}
}
