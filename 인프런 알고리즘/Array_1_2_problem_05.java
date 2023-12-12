import java.util.Scanner;

public class Array_1_2_problem_05 {
	public static void main(String[] args) {
		
		// 소수의 개수 구하는 문제
		
		// 1. 테스트케이스 int 받아온다.
		// 2. 배열을 만들어서 int만큼 방을 만든다.
		// 3. answer 받아온다.
		// 4. for문을 배열 길이만큼 돌리는데, if문으로 arr[i] == 0이면 answer++해준다.
		// 5. for - if - for문을 돌려서, 소수의 배수들은 1로 변경한다.
		// 6. answer을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int [] arr = new int [num+1];
		int answer = 0;
		
		//0과 1은 소수가 아니므로 2부터 시작한다.
		for (int i = 2; i <= num; i++) {
			if (arr[i] == 0) {
				answer ++;
				for (int j = i; j <= num; j=j+i) {
					arr[j] = 1;
				}
			}
		}
		System.out.println(answer);
	}
}
