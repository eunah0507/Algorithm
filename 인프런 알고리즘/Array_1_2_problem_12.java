import java.util.Scanner;

public class Array_1_2_problem_12 {
	public static void main(String[] args) {

		// m명의 학생이 n번 시험을 봤을 때, 몇 쌍의 멘토-멘티가 존재하는지 구하는 문제

		// 1. 테스트케이스 int m을 받아온다.
		// 2. 테스트케이스 int n을 받아온다.
		// 3. 2차원 배열을 받아온다.
		// 4. 2중 for문을 돌려서 값을 채워준다.
		// 5. 새로운 4중 for문을 돌린다.
		// (i(한 명이)-j(다른 사람과)-k(몇 번 시험을 보고)-s(몇 등인지)
		// 6. i학생과 j학생의 등수를 뽑아서, 변수에 새로 넣어준다.
		// 7. if문을 돌려 i학생이 j학생보다 작을 때(멘토니까) cnt++한다.
		// 7. 다시 if문을 돌려 cnt가 테스트횟수와 같을 때
		// (i학생이 j학생보다 모든 점수를 높게 받았다는 뜻) 멘토가 되므로 answer++한다.

		Scanner sc = new Scanner(System.in);

		// 학생 수
		int M = sc.nextInt();
		// 시험 본 횟수
		int N = sc.nextInt();
		// 시험 본 횟수가 행이므로 NM으로 받는다.
		int[][] arr = new int[N][M];
		
		// 배열을 채워준다.
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// 답을 출력할 변수를 생성한다.
		int answer = 0;
		
		// 멘토가 될 수 있는지 i학생의 경우의 수를 구한다.
		for (int i = 1; i <= M; i++) {
			// 멘티가 될 j학생과 비교한다.
			for (int j = 1; j <= M; j++) {
				// cnt는 for문이 돌 때마다 초기화 되어야 하므로 여기에 선언한다.
				int cnt = 0;
				// 시험을 몇 번 봤는지 for문을 돌린다.
				for (int k = 0; k < N; k++) {
					// i학생의 등수와 j학생의 등수를 비교해야하므로 여기에 선언해둔다.
					int pi = 0;
					int pj = 0;
					// i학생의 등수와 j학생의 등수를 구한다.
					for (int s = 0; s < M; s++) {
						// 해당 위치의 등수가 i학생의 등수를 찾아서 변수에 넣어준다.
						if (arr[k][s] == i) {
							// 미리 선언해둔 pi에 값을 넣는다.
							pi = s;
						}
						
						// 다시 if문을 돌려서 j학생의 등수를 찾고, 넣어준다.
						if (arr[k][s] == j) {
							pj = s;
						}
					}
					
					// i학생의 등수가 j학생의 등수보다 낮으면(낮을 수록 점수가 높으므로)
					if (pi < pj) {
						// cnt를 올려준다.
						cnt ++;
					}
				}
				
				// cnt가 시험을 본 횟수와 같다면 답을 세준다.
				if (cnt == N) {
					answer++;
				}
			}
		}
		
		System.out.println(answer);
	}
}
