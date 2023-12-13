import java.util.Scanner;

public class Array_1_2_problem_07 {
	public static void main(String[] args) {

		// 점수의 총합을 구하는 문제
		
		// 1. 테스트케이스 int를 받아온다.
		// 2. 배열을 만든다.
		// 3. for문을 돌려 배열 값을 채워준다.
		// 4. 새로운 int 변수를 만들어준다(answer, cnt)
		// 5. for문을 새로 돌린 후, 조건문으로 arr[i] == 1 이면 cnt와 answer를 증가시킨다.
		// 6. arr[i] == 0 이면 cnt = 0으로 초기화해준다.
		// 7. answer을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int [] arr = new int [num];
		int cnt = 0;
		int answer = 0;
		
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num; i++) {
			if (arr[i] == 1) {
				cnt ++;
				answer += cnt;
			} else {
				cnt = 0;
			}
		}
		System.out.println(answer);
	}
}
