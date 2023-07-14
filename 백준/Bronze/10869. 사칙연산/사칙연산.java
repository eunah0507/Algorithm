import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 두 자연수 A와 B가 주어진다.
		// 이때, A+B, A-B, A*B, A/B(몫),
		// A%B(나머지)를 출력하는 프로그램을 작성하시오. 
		
		
		Scanner sc = new Scanner(System.in);
		
		int A;
		A = sc.nextInt();
		
		int B;
		B = sc.nextInt();
		
		int answer1;
		int answer2;
		int answer3;
		int answer4;
		int answer5;
		
		answer1 = A+B;
		answer2 = A-B;
		answer3 = A*B;
		answer4 = A/B;
		answer5 = A%B;
		
		System.out.println(answer1);
		System.out.println(answer2);
		System.out.println(answer3);
		System.out.println(answer4);
		System.out.println(answer5);
		
	}
}
