import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// A,B를 입력받아 A~B부터 소수를 찾아 총 합을 구하고, 최솟값을 구하는 문제
		
		// 1. 테스트케이스 int를 2개 받아온다.
		// 2. 시작을 A부터 B까지 for문을 돌려서 소수를 찾는다.
		// 3. 총합과, 최솟값에 대한 변수를 받아온다.
		// 4. 소수를 찾으면 최소값을 찾기 위해 min을 찾아 비교한다.
		// 5. 소수를 찾으면 총합 변수에 계속 더해준다.
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		for (int i = A; i <= B; i++) {
			boolean flag = true;
			if (i == 1) {
				flag = false;
			}
			
			for (int j = 2; j < i; j++) {
				if (i%j == 0) { 
					flag = false;
				}
			}
			
			if (flag == true) {
				sum += i;
				min = Math.min(min, i);
			}
		}
		
		if (sum == 0) {
			min = -1;
			System.out.println(min);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}