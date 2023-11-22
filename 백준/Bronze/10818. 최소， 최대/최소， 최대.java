import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		
		// 1. 테스트케이스 T를 받아온다.
		// 2. T안에 돌려서 n개의 방을 넣어준다.
		// 3. n개의 방을 for문으로 돌리며 min값을 찾는다.
		// 4. 찾은 min값을 출력한다.
		// 5. 다시 for문을 돌려 max값을 찾는다.
		// 6. 찾은 max값을 출력한다.
		
		// 변수타입 [] 변수명 = new 변수타입 [n];
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int [] N = new int [T];
		
		for (int i = 0; i < T; i++) {
			N[i] = sc.nextInt();
		}
		
		int down = Integer.MAX_VALUE;
		int up = Integer.MIN_VALUE;
		
		for (int i = 0; i < T; i++) {
			down = Math.min(down, N[i]);
			up = Math.max(up, N[i]);
		}
		
		System.out.print(down);
		System.out.println(" "+up);
	}
}
