import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
		
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			sb.append("Case #" + i + ": ");
			sb.append(A+B);
			sb.append("\n");
			
		}
		
		
		System.out.println(sb.toString());
	}
}
