import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		// n을 입력받게 받아온다.
		// n을 for문을 돌려서 더해준다. n은 1부터 시작하게 한다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 0;
		
		for (int i = 1; i <= n; i++) {
			a = a+i;
		}
		System.out.println(a);
		
	}
}
