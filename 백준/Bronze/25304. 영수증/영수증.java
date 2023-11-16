import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * 첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다. 
		 * 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다. 
		 * 이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
		 */
		
		// 1. 총금액 X를 받아온다.
		// 2. 그 후, 구매 물건의 총개수를 받아온다.
		// 3. 물건을 각각 얼마에 몇 개 샀는 지 숫자를 받아온다.
		// 4. 다 더한 값이 맞으면 yes, 아니면 no가 출력되게 한다.
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		
		int sum = 0;
				
		for (int i = 1; i <= N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			sum = sum+(a*b);
		}
		
		if (sum == X) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
