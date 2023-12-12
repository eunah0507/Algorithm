import java.util.Scanner;

public class Array_1_2_problem_03 {
	public static void main(String[] args) {
		// 가위바위보 문제
		
		// 1. 테스트케이스 int를 받아온다.
		// 2. A와 B를 배열로 받아온다.
		// 3. for문을 돌려서 A와 B안의 값을 채워준다.
		// 4. 다시 for문 안에 if문을 돌려서 A가 이길때와 비길때의 조건을 써준다.
		// 5. 그 외의 값은 모두 B가 이기게끔 출력한다.
		// 6. foreach문을 돌려서 입력받은 값을 출력해준다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int [] A = new int [num];
		int [] B = new int [num];
		String answer = "";
		
		// A랑 B를 같이 받아오면 안되나? A 한 줄, B 한 줄 나와야하는데 동시에 받아오면 ABABAB이렇게 받아온다.
		for (int i = 0; i < num; i++) {
			A[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num; i++) {
			B[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num; i++) {
			if (A[i] == B[i]) {
				answer += "D";
			} else if (A[i] == 1 && B[i] == 3){
				answer += "A";
			} else if (A[i] == 2 && B[i] == 1) {
				answer += "A";
			} else if (A[i] == 3 && B[i] == 2) {
				answer += "A";
			} else {
				answer += "B";
			}
		}
		
		// foreach는 배열만 가능한데, answer은 String이니까 toCharArray()메서드를 받아온다.
		for (char i : answer.toCharArray()) {
			System.out.println(i);
		}
	}
}
