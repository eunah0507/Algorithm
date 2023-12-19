import java.util.Scanner;

public class Array_1_2_problem_11 {
	public static void main(String[] args) {
		
		// 각 학생이 1~5학년때까지 몇 명과 반이 겹쳤는지, 누가 가장 많이 겹쳤는지 알아보는 문제
		
		// 1. 테스트케이스 int를 받아온다.
		// 2. 배열을 만들어준다.
		// 3. for문을 돌려서 값을 받아온다.
		// 4. 변수 answer와 max를 받아온다.
		// 5. 3중 for문을 돌린다. (i번학생과 j번학생이 k학년 때 같은 반이었는지 비교하기 위해)
		// 6. 이 때, 같은 반이었다면 cnt++ 해준다.
		// 7. if문을 돌려서 cnt와 max를 비교하고, cnt값이 더 크면 max에 넣어준다.
		// 8. max에 들어간 i번째 학생을 answer에 넣어준다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		// 1번 학생이 1학년 때부터 세는거라서 n+1, 5+1 하는 것
		int [][] arr = new int[num+1][6];
		
		for (int i = 1; i<=num; i++) {
			for (int j = 1; j < 6; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int answer = 0;
		int max = Integer.MIN_VALUE;
		
		for (int i = 1; i <= num; i++) {
			int cnt = 0;
			for (int j = 1; j <= num; j++) {
				for (int k = 1; k <= 5; k++) {
					if (arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			
			if (cnt > max) {
				max = cnt;
				answer = i;
			}
		}
		
		System.out.println(answer);
	}
}
