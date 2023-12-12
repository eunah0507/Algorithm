import java.util.Scanner;

public class Array_1_2_problem_04 {
	public static void main(String[] args) {
		// 피보나치 수열 문제
		
		// 1. 테스트케이스 int를 받아온다.
		// 2. 배열 answer를 받아온다.
		// 3. 피보나치 수열의 첫 두 수는 무조건 1이니까 배열[0],[1]값에 1을 넣어준다.
		// 4. for문을 돌려서 answer[i]는 i의 앞 두 수의 합임을 써준다.
		// 5. 다시 for문을 돌려서 answer값을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int [] answer = new int [num];
		
		answer[0] = 1;
		answer[1] = 1;
		
		// 배열 answer[]의 초기값이 모두 0이기 때문에 +=하거나 = 해도 값이 같다.
		for (int i = 2; i < num; i++) {
			answer[i] = answer[i-1] + answer[i-2];
		}
		
		for (int i = 0; i < num; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}
