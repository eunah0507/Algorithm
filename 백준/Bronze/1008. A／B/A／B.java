import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 두 정수 A와 B를 입력받은 다음,
		// A×B를 출력하는 프로그램을 작성하시오.
		
		
		Scanner sc = new Scanner(System.in);
		
		double A;
		A = sc.nextInt();
		
		double B;
		B = sc.nextInt();
		
		double answer;
		
		answer = A/B;
		
		System.out.println(answer);
		
	}
}
