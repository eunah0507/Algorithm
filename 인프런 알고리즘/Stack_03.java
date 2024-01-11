import java.util.Scanner;
import java.util.Stack;

public class Stack_03 {
	public static void main(String[] args) {
		
		// 인형뽑기 문제
		
		// 1. 테스트케이스 int를 받아온다.
		// 2. 이차원 배열을 만든다.
		// 3. 테스트케이스 int를 받아온다.
		// 4. 배열을 만들어 값을 채운다.
		// 5. 답을 출력할 answer 변수를 만든다.
		// 6. stack을 만든다.
		// 7. forEach문을 돌려 값을 채운다.
		// 8. 그 안에 for문을 돌려 0이 아니라면 인형을 꺼내온다.
		// 9. 뽑아온 인형과 stack에 저장된 인형이 같다면 pop한다.
		// 10. 뽑아왔으니까 그 자리는 0으로 변경한다.
		// 11. stack이 비어있지 않고 같이 제거해줬다면 answer에 +2한다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] board = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		int a = sc.nextInt();
		int [] moves = new int [a];
		
		for (int i = 0; i < a; i++) {
			moves[i] = sc.nextInt();
		}
		
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		for (Integer pos : moves) {
			for (int i = 0; i < board.length; i++) {
				// 배열은 0부터 시작하니까 -1해준다.
				if (board[i][pos-1] != 0) {
					int tmp = board[i][pos-1];
					board[i][pos-1] = 0;
					// stack.peek() == 스택의 맨 위에 있는 요소를 제거하지 않고 반환
					if (!stack.isEmpty() && tmp == stack.peek()) {
						// 같은 캐릭터 2개가 만나면 사라지니까 2씩 증가
						answer += 2;
						// 같은 캐릭터가 만나면 사라지니까 꺼내준다.
						stack.pop();
					}else {
						stack.push(tmp);
					}
					break;
				}
			}
		}
		
		System.out.println(answer);
		
	}
}
