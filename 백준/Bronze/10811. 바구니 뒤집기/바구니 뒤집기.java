import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 도현이는 바구니가 N개 있다. M번 바구니를 역순으로 섞는다.
		// 첫번째 줄에는 N과 M이 출력되고, 두번째 줄부터는 x,j가 출력된다.
		// x번부터 y번까지 역순으로 바꾸겠다는 소리이다.
		
		// 1. 테스트케이스 N을 받아온다.
		// 2. 테스트케이스 M을 받아온다.
		// 3. for문을 돌려서 배열 N안에 차례를 부여한다.
		// 4. for문 안에 for문을 돌려서 역순으로 차례를 뒤집는다.
		// 5. 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int [] arr = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			arr [i] = i;
		}
		for (int i = 1; i <= M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int tmp;
			while (x<y) {
				tmp = arr[x];
				arr[x] = arr[y];
				arr[y] = tmp;
				x++;				// 배열 x차례를 가장자리부터 바꾸는 것. 배열 값x가 아님.
				y--;				// 가장자리부터 바꾸는 것.	
			}
		}
		
		for (int j = 1; j <= N; j++) {
			System.out.print(arr[j] + " ");
		}
	}
}
