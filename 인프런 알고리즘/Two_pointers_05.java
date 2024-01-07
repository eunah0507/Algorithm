import java.util.Scanner;

public class Two_pointers_05 {
	public static void main(String[] args) {
		
		// 자연수 n이 주어지면, n이 나올 때 까지 숫자를 더하는 문제
		
		// 1. 테스트케이스 int를 받아온다.
		// 2. 숫자를 더해 n이 나와야하니까 더하는 숫자의 최대크기는 n/2+1정도다.
		//    변수 m을 만들고 초기값은 n/2+1로 한다.
		// 3. 배열을 만들고 크기는 m 만큼 준다.
		// 4. for문을 돌려서 arr[i]=i+1로 넣어준다.(약수 시작은 1부터니까)
		// 5. 다시 for문을 n까지 돌려서, 그 합이 n이면 answer를 증가시킨다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = n/2+1;
		int [] arr = new int [m];
		
		for (int i = 0; i < m; i++) {
			arr[i] = i+1;
		}
		
		int sum = 0;
		int lt = 0;
		int answer = 0;
		
		for (int rt = 0; rt < m; rt++) {
			sum += arr[rt];
			
			if (sum == n) {
				answer++;
			}
			
			while(sum >= n) {
				sum -= arr[lt++];
				
				if (sum == n) {
					answer++;
				}
			}
		}
		
		System.out.println(answer);
	}
}
