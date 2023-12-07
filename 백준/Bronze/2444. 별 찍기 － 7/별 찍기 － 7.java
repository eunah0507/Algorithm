import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력하는 문제
		
		// 1. 테스트케이스 int를 받아온다.
		// 2. for문안에 for문을 돌린다.
		// 3. for문을 써서 한 줄이 증가할 때 마다 " "는 줄어들고 "*" 늘어나게 한다.
		// 4. 조건문을 써서 2*num-1이 찍히면, 다시 감소하게 한다. (식이 분명 있을 것 같은데 내가 세우지 못했다.)
		// 4. 최대치까지만 *을 출력하고, 종료 후 다시 for문을 반대로 돌려 감소식을 출력한다.
		// 5. 반대로 for문을 돌릴 경우, 같은 *이 출력되지 않게 시작값을 num이 아니라 num-1값을 준다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2-1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (int i = num-1; i >= 1; i--) {
			for (int j = i; j < num; j++) {
				System.out.print(" ");
			}
			for (int j = i*2-1; j > 0; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}