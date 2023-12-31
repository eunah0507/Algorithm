import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		// 각이 예각인지 직각인지 둔각인지 출력하는 문제
		
		// 1. 테스트케이스 int 3개를 받아온다.
		// 2. if문을 돌려서 각각 상황에 맞게 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a + b + c == 180 && a == b && b == c) {
			System.out.println("Equilateral");
		}else if (a + b + c == 180 && a == b || a == c || b == c) {
			System.out.println("Isosceles");
		}else if (a + b + c == 180 && a != b && b != c) {
			System.out.println("Scalene");
		}else if (a + b + c != 180) {
			System.out.println("Error");
		}
	}
}