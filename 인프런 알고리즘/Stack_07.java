import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Stack_07 {
	public static void main(String[] args) {
		// 무조건 들어야하는 과목을 순서대로 poll()했는지 문제
		
		// 1. 테스트케이스 String을 2개 받는다.
		// 2. 답을 출력할 answer 변수를 만든다.
		// 3. Queue를 만들고 forEach문으로 채운다.
		// 4. 다른 forEach문을 돌려서 조건을 채운다.
		// 4-1. queue.contains()했는데 부정이면 NO
		// 4-2. queue.isEmpty()했는데 부정이면 NO
		// 5. 그 외는 YES로 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		String need = sc.next();
		String all = sc.next();
		// 초기값을 YES로 주고, 틀릴경우에만 바꾼다.
		String answer = "YES";
		
		Queue <Character> Q = new LinkedList<>();
		
		// Q값을 채운다.
		for (Character ch : need.toCharArray()) {
			Q.add(ch);
		}
		
		// all과 Q를 비교하기 시작한다.
		for (Character ch : all.toCharArray()) {
			// ch값이 Q의 맨 앞 값에 없으면 NO 한다.
			if (Q.contains(ch)) {
				if (ch != Q.poll()) {
					answer = "NO";
					break;
				}
			}
		}
		
		// forEach문이 끝났는데 Q값이 비어있지 않다면
		if (!Q.isEmpty()) {
			answer = "NO";
		}
		
		System.out.println(answer);
		
	}
}
