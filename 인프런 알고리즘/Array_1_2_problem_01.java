import java.util.Scanner;

public class Array_1_2_problem_01 {
	public static void main(String[] args) {

		// 입력받은 숫자의 첫번째 수 보다 큰 숫자들을 출력하는 문제

		// 1. 테스트케이스 int를 받아온다.
		// 2. int를 배열안에 넣어준다.
		// 3. answer를 받아온다. answer도 배열로 받아온다. 여러 수가 나와야하니까
		// 4. for문을 돌려서 배열 안의 값을 넣어준다.
		// 5. if문을 돌려서 앞에 위치한 수 보다 크면 출력해준다.

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] arr = new int[num];
		int answer [] = new int [num];
		int length = 0;

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		answer[0] = arr[0];
		
		for (int i = 0; i < num-1; i++) {
			if (arr[i] < arr[i+1]) {
				length ++;
				answer[length] = arr[i+1];
			}
		}
		
		for (int i = 0; i <= length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}
