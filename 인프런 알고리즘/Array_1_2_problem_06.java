import java.util.Scanner;

public class Array_1_2_problem_06 {
	
	public static boolean isPrime(int num) {
		// 1은 소수가 아니므로 제거해준다.
		if (num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num%i == 0) {
				return false;
			}
		}
		//for문 안에 true값을 else로 넣지 않은 이유는 i값이 돌아가면서 계속 나눠줘야하기 때문이다.
		return true;
	}
	
	public static void main(String[] args) {
		// 숫자를 입력받고 뒤집어서 그 수가 소수이면 출력하는 문제
		
		// 1. 테스트케이스 int 받아온다.
		// 2. 배열 int를 만들어준다.
		// 3. for문을 돌려 배열 값을 채워준다.
		// 4. 다시 for문을 새로 돌려 뒤집을 때 필요한 변수 tmp와 res를 만들어준다.
		// 5. while문을 돌려 수를 뒤집는다.
		// 6. boolean을 통해 그 수가 소수인지 확인한다.
		// 7. true값만 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int [] arr = new int [num];
		
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num; i++) {
			int tmp = arr[i];
			int res = 0;
			// 뒤집었을 때, 0으로 시작하면 안되기 때문에
			while(tmp>0) {
				// 10으로 나눠줘서 나머지가 몇인지
				int t = tmp%10;
				res = res*10+t;
				tmp = tmp/10;
			}
			//isPrime(num)을 썼는데, 변수타입이 같아서 res도 넣을 수 있다.
			if (isPrime(res) == true) {
				System.out.print(res + " ");
			}
		}
		
	}
}
