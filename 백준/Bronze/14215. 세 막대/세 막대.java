import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//a, b, c가 주어졌을 때, 만들 수 있는 가장 큰 둘레를 구하는 프로그램을 작성

		// 삼각형의 조건 : 두 변의 길이의 합 > 나머지 길이의 합
		// 1. 테스트케이스 3개를 int로 받아온다.
		// 2. if문을 돌려서 3가지 조건에서 둘레를 구한다.
		// 2-1. 세 변의 길이가 같을 때의 둘레 => 줄이는 것 없이 변*3
		// 2-2. 두 변의 길이가 같을 때의 둘레 => 두 변의 길이의 합 > 나머지 길이의 합
		// 2-3. 모든 변의 길이가 다를 때의 둘레 => 두 변의 길이의 합 > 나머지 길이의 합

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a == b && b == c) {
			System.out.println(a + b + c);
		} else if (a + b <= c) {
			c = a + b - 1;
			System.out.println(a + b + c);
		} else if (a + c <= b) {
			b = a + c - 1;
			System.out.println(a + b + c);
		} else if (b + c <= a) {
			a = b + c - 1;
			System.out.println(a + b + c);
		} else {
			System.out.println(a + b + c);
		}
	}
}