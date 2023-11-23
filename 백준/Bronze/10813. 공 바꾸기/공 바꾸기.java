import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 도현이는 N개의 바구니가 있다. M번에 걸쳐 공을 바꾸려 한다.
		
		// 1. 테스트케이스 N을 받아온다.
		// 2. 테스트케이스 M을 받아온다.
		// 3. for문을 돌려서 배열 N 안을 채워준다.
		
		// 4. i,j를 각각 받아온다.
		// 6. 최종적으로 바뀐 공 순서를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int [] arr = new int [N+1];
		
		for (int i = 1; i <= N; i++) {
			arr[i] = i;
		
		}
		
		for (int i = 1; i <= M; i++) {
			int x = sc.nextInt();
			int j = sc.nextInt();
			
			int tmp = arr[x];
			arr [x] = arr[j];
			arr [j] = tmp;
		}
		for (int i = 1; i <= N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
