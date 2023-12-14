import java.util.Scanner;

public class Array_1_2_problem_09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 5*5 격자판의 대각선, 행, 열 의 덧셈 중 가장 큰 값 출력하기
		
		// 1. 테스트케이스 int를 받아온다.
		// 2. 배열을 만들어주고, for문을 돌려 값을 채워준다.
		// 3. 
		
		int num = sc.nextInt();
		int [][] arr = new int [num][num];
		int sum1, sum2;
		int answer = Integer.MIN_VALUE;
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < num; i++) {
			sum1 = sum2 = 0;
			for (int j = 0; j < num; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		
		sum1 = sum2 = 0;
		
		for (int i = 0; i < num; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][num-i-1];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		System.out.println(answer);
	}
}
