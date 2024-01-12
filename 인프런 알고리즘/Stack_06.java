import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Stack_06 {
	public static void main(String[] args) {
		// 공주를 구하러갈 n-1명의 겁쟁이들과 왕자님 1명 찾기
		
		// 1. 테스트케이스 int를 2개 받는다
		// 2. 답을 출력할 answer 변수를 만든다.
		// 3. Queue를 만든다.
		// 4. for문을 n까지 돌려서 add해준다.
		// 5. while문을 돌려서 k-1까지 poll하고 다시 add한다.
		// 6. k번째 왕자는 poll한다.
		// 7. 그렇게 queue.size() == 1이 되면 answer에 넣어준다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int answer = 0;
		
		Queue<Integer> queue = new LinkedList<>();
		
		// 왕자는 1번째부터 시작하니까
		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		
		while(!queue.isEmpty()) {
			for (int i = 1; i < k; i++) {
				queue.add(queue.poll());
			}
			
			queue.poll();
			
			if (queue.size() == 1) {
				answer = queue.poll();
			}
		}
		
		System.out.println(answer);
	}
}
