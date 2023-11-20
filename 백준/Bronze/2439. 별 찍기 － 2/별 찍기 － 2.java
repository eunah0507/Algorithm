import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		// 1. 테스트케이스 T개를 받아온다.
		// 2.1부터 T개까지 *을 출력한다
		// 3. 빈 공간을 만들어서 같이 출력한다.

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		//줄의 개수
		for (int i = 1; i <= T; i++) {
			//빈공간의 개수(*갯수는 빼줘야하니까 = 제거)
			for (int j = T; j > i; j--) {
				System.out.print(" ");
			}
			//별의 개수
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
