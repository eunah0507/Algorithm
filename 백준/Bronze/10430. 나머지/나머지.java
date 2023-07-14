import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 세 수 A, B, C가 주어졌을 때,
		// 위의 네 가지 값을 구하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int A;
		A = sc.nextInt();
		
		int B;
		B = sc.nextInt();
		
		int C;
		C = sc.nextInt();
		
		int answer1;
		int answer2;
		int answer3;
		int answer4;
		
		answer1 = (A+B)%C;
		answer2 = ((A%C) + (B%C))%C;
		answer3 = (A*B)%C;
		answer4 = ((A%C) * (B%C))%C;
		
		
		System.out.println(answer1);
		System.out.println(answer2);
		System.out.println(answer3);
		System.out.println(answer4);
		
	}
}
