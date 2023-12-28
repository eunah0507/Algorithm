import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 주어진 수 중에서 소수 찾기 문제
		
		// 1. 테스트케이스 int를 받아온다.
		// 2. 답을 출력할 변수를 만든다.
		// 3. for문을 테스트케이스만큼 돌려서 입력을 받는다.
		// 4. 다시 for문을 돌려서 2부터 n-1까지 나눠서 나머지가 없을 경우에만 answer++한다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int answer = 0;
		
		for (int i = 0; i < num; i++) {
			int n = sc.nextInt();
			boolean flag = true;
			if (n == 1) {
				flag = false;
			}
			
			for (int j = 2; j < n; j++) {
				if (n%j == 0) {
					flag = false;
				}
			}
			
			
			if (flag == true) {
				answer ++;
			}
		}
		System.out.println(answer);
	}
}