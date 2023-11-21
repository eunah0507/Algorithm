import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		// N개의 방이있는 배열 A속에서 X보다 작은 방을 모두 출력해라.
		
		// 1. N개를 받아온다.
		// 2. N개의 방이있는 A를 받아온다.
		// 3. A속에서 for문을 돌려서 X보다 작은 수가 있다면 그 수를 출력한다.
		
		// 변수타입 [] 변수명 = new 변수타입 [n];
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int [] arr = new int[N];
		int X = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			arr[i]=sc.nextInt();
			if (arr[i]<X) {
				System.out.print(arr[i] + " ");
			}
		}
		
		
		
	}
}
