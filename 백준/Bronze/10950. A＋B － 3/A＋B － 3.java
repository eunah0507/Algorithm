import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		/*
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		 * 
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 
		 * A+B를 출력한다.
		 * 
		 * 1. 테스트 개수 T를 받아온다.
		 * 2. T의 개수만큼 a,b를 받아온다.
		 * 3. a와 b를 더한 값을 출력한다.
		 *
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int i = 1; i <= T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
		}
		
	}
}
