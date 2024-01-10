import java.util.Scanner;
import java.util.Stack;

public class Stack_02 {
	public static void main(String[] args) {
		// 괄호 안에 안묶인 문자만 출력하는 문제
		
		// 1. 테스트케이스 String을 받는다.
		// 2. 답을 출력할 answer 변수를 만든다.
		// 3. Stack을 만든다.
		// 4. forEach문을 돌려서 값을 넣는다.
		// 5. forEach문 안에 if문을 넣어서 ')'가 아니면 add한다.
		// 6. '(' 일 경우 while문을 돌려서 그 동안 축적된 문자를 모두 pop한다.
		// 7. for문을 stack.size()만큼 돌려서 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String answer = "";
		
		Stack<Character> stack = new Stack<>();
		
		for (Character c : str.toCharArray()) {
			if (c == ')') {
				while(stack.pop() != '(');
			}else {
				stack.push(c);
			}
		}
		
		for (int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
		}
		
		System.out.println(answer);
	}
}
