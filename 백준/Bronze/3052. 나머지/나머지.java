import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성
		// 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수
		
		// 1. 배열 arr를 boolean으로 42를 받는다.
		// 2. 배열 arr 안에 값을 넣어준다.
		// 3. for문을 10번 돌려서 각각의 값을 42로 나눈다.
		// 4. 이 때, 나머지가 있는 경우 true를 반환한다.
		// 5. 다시 for문을 돌려서 true인 값이 있을 때 count++해준다.
		// 6. count를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		boolean [] arr = new boolean[42];
		
		for (int i = 0; i < 10; i++) {
			arr[sc.nextInt()%42]=true;
		}
		
		for (int i = 0; i < 42; i++) {
			if (arr[i]==true) {
				count++;
			}
		}
		System.out.println(count);
	}
}
