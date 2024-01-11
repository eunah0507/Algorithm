import java.util.Scanner;
import java.util.Stack;

public class Stack_04 {
	public static void main(String[] args) {
		// 후위식 연산을 통해 값을 출력하는 문제
		
		// 1. 테스트케이스 String을 받아온다.(연산이 들어가서)
		// 2. 답을 출력할 answer 변수를 만든다.
		// 3. stack을 만든다.
		// 4. forEach문으로 stack계산을 시작한다.
		// 5. if문을 써서 i번째 stack의 값이 숫자이면 add한다.
		//    이 때, 바로 add하지 않고, 48을 빼준다.(아스키코드)
		// 6. left, right변수를 만들어 stack.pop();을 넣어준다.
		// 7. 다시 if문을 써서 연산을 만나면 left값에서 rigght값을 연산한다.
		// 8. 모든 계산이 끝나면 stack에는 숫자 하나가 남는데, 그걸 get한다.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int answer = 0;
		
		Stack <Integer> stack = new Stack<>();
		
		for (char c : str.toCharArray()) {
			//Character.isDigit(char c) = 지정된 문자가 숫자인지 확인하는 데 사용, T/F값 반환
			if (Character.isDigit(c)) {
				stack.add(c - '0');
			}else {
				// 처음으로 꺼내지는 숫자를 오른쪽에 둔다.
				int right = stack.pop();
				// 두번째로 꺼내지는 숫자로 연산을 한다.
				int left = stack.pop();
				
				if (c == '+') {
					stack.add(left + right);
				} else if(c == '-') {
					stack.add(left - right);
				} else if(c == '*') {
					stack.add(left * right);
				} else if(c == '/') {
					stack.add(left / right);
				}
			}
		}
		
		answer = stack.get(0);
		System.out.println(answer);
	}
}
