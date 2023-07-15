import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 세 수 A, B, C가 주어졌을 때,
		// 위의 네 가지 값을 구하는 프로그램을 작성하시오.
		
		// 1. 세자리 수를 두 개 받는다
		// 2. 두번째 숫자의 끝자리 수가 첫번째 숫자를 곱한 값을 받는다
		// 3. 두번째 숫자의 가운데 수가 첫번째 숫자를 곱한 값을 받는다.
		// 4. 두번째 숫자의 첫번째 수가 첫번째 숫자를 곱한 값을 받는다.
		// 5. 두 개의 숫자를 모두 곱한 값을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int A;
		A = sc.nextInt(); //1
		
		int B;
		B = sc.nextInt(); //1
		
		int answer1, answer2, answer3,answer4;
		
		answer1 = (B%100)%10*A; //2
		answer2 = (B%100)/10*A; //3
		answer3 = (B/100)*A; //4
		answer4 = A*B;
		
		System.out.println(answer1);
		System.out.println(answer2);
		System.out.println(answer3);
		System.out.println(answer4);
		
	}
}
