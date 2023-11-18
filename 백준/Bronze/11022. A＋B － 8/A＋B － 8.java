import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		// 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. 
		// x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
		// ex. Case #1: 1 + 1 = 2
		
		// 1. 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		// 2. T 안에 들어갈 A,B를 받아온다.
		// 3. A+B를 해준다.
		// 4. Case #x: A + B = C 문자열에 맞춰 출력한다.
		
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		int T = sc.nextInt();
		
		for (int i = 1; i <= T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			/*
			 * System.out.print("Case #"+i+": " +A+ " + " + B + " = ");
			 * System.out.println(A+B);
			 */
			
			sb.append("Case #"+i+": " +A+ " + " + B + " = ");
			sb.append(A+B);
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
