import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 행렬 총합 구하는 문제

		// 1. 테스트케이스 int를 받아온다.
		// 2. 테스트케이스 int를 받아온다.
		// 3. 2차원배열에 [][]안에 두 int를 넣는다.
		// 4. for문 안에 for문을 돌려서 테스트케이스 값을 받아온다.
		// 5. 그 값을 누적해준다.

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();
		int[][] arr = new int[X][Y];

		for (int i = 0; i < X; i++) {
			for (int j = 0; j < Y; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < X; i++) {
			for (int j = 0; j < Y; j++) {
				arr[i][j] += sc.nextInt();
			}
		}
		for (int i = 0; i < X; i++) {

			for (int j = 0; j < Y; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}