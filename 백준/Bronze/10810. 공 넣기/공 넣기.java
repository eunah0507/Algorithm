import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다. 
		// 각 방법은 세 정수 i j k로 이루어져 있으며, i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻이다.
		
		// 1. 테스트케이스 N개를 받아온다.
		// 2. int M을 받아온다.
		// 3. N의 방을 만들어준다.
		// 4. for문 안에 M번 반복하여 int x,j,k를 받아온다.
		// 5. x부터 j까지 k값이 들어가게 한다.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		N++;
		int M = sc.nextInt();
		int [] arr = new int [N];
		
		for (int i = 0; i < M; i++) {
			int x = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for (int a = x; a <= j; a++) {
				arr[a] = k;
			}
		}
		for (int i = 1; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
