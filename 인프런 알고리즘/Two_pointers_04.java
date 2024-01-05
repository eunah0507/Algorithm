import java.util.Scanner;

public class Two_pointers_04 {
	public static void main(String[] args) {
		// 연속부분수열을 구하는 문제
		
		// 1. 테스트케이스 int 2개를 받아오고, for문을 돌려 채워준다.
		// 2. 변수 answer, sum, lt를 만들어 각 값을 0으로 초기화한다.
		// 3. for문을 rt부터 n까지 돌린다.
		// 4. sum에 rt값을 더해주면서 입력받은 합과 같을 때 answer++한다.
		// 5. sum <= m일때, lt값을 증가시켜준다. 이후 반복한다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int [] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int answer = 0;
		int sum = 0;
		int lt = 0;
		
		for (int rt = 0; rt < n; rt++) {
			sum += arr[rt];
			if (sum == a) {
				answer++;
			}
			
			while(sum >= a) {
				sum -= arr[lt++];
				if (sum == a) {
					answer++;
				}
			}
		}
		
		System.out.println(answer);
	}
}
