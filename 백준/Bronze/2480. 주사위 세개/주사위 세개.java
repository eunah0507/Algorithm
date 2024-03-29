import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		/*
		 * 1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
		 * 2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
		 * 3.모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		int B = sc.nextInt();
		
		int C = sc.nextInt();
		
		if(A==B && B==C) {
			System.out.println(10000+A*1000);
		}else if(A==B) {
			System.out.println(1000+A*100);
		}else if(B==C) {
			System.out.println(1000+B*100);
		}else if(A==C) {
			System.out.println(1000+A*100);
		}else {
			int d = Math.max(A, B);
			int e = Math.max(d, C);
			
			System.out.println(e*100);
		}
		
	}
}
