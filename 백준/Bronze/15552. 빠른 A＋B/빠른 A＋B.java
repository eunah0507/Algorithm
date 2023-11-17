import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
		//1. 테스트케이스(몇개인지) X를 받아온다.
		//2. 각 개수 A,B를 선언해준다.
		//3. for문으로 X만큼 돌려준다.
		//4. A+B를 해준다. 출력한다.
		
		Scanner sc = new Scanner(System.in);
		StringBuffer sa = new StringBuffer();
		
		
		int X = sc.nextInt();
		
		for (int i = 1; i <= X; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			sa.append(A+B);
			sa.append('\n');
			
		}
		System.out.println(sa.toString());
	}
}
