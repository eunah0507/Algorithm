import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		// 1. 9개의 자연수가 주어짐.
		// 2. for문으로 배열 arr에 테스트케이스를 받아옴.
		// 3. Math.max를 이용하여 최댓값을 찾음
		// 4. 몇 번째 숫자에서 최댓값이 나왔는지 찾음
		// 5. 각각 출력함
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		
		int [] arr = new int [9];
		for (int i = 0; i < 9; i++) {
			arr[i]=sc.nextInt();
			max = Math.max(max, arr[i]);
		}
		System.out.println(max);
		
		for (int i = 0; i < 9; i++) {
			if (arr[i] == max) {
				System.out.println(i+1); //배열은 0부터 시작하지만, 여기선 1부터 세니까 +1한다.
			}
		}
	}
}
