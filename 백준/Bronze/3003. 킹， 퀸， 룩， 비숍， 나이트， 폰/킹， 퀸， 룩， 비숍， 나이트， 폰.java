import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로
		// 구성되어 있다. 테스트케이스를 받아 몇 개를 더하거나 빼야 완성되는지 푸는 문제
		
		// 1. 테스트케이스 int를 6개 받아온다.
		// 2. if문을 돌려서.. 총 18번을 돌려야하나?(이건 좀;)
		// 2. 킹,퀸 등등 6개의 int 변수를 새로 줘서 새로운 int - 테스트케이스 int를 해준다.
		// 3. 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		int king = 1;
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;
		
		System.out.print(king - a + " ");
		System.out.print(queen - b + " ");
		System.out.print(rook - c + " ");
		System.out.print(bishop - d + " ");
		System.out.print(knight - e + " ");
		System.out.print(pawn - f + " ");

	}
}