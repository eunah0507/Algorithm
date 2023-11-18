import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		// 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		
		// 1. 테스트케이스 T개를 받아온다.
		// 2. T개만큼 1부터 시작해서 *로 치환해서 출력한다.
		
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
	
		// 줄
		for (int i = 1; i <= T; i++) {
			//별의 갯수
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
