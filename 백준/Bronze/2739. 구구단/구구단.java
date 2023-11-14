import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 출력형식과 같게 N*1부터 N*9까지 출력한다.
		// 2 * 1 = 2
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		
		for (int i = 1; i < 10; i++) {
			String str = a + " * " + i + " = " + a*i;
			
			System.out.println(str);
		}
				
		
		
	}
}
