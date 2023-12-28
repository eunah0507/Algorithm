import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 정수 N이 주어졌을 때, 소인수분해하는 문제

		// 1. 테스트케이스 int를 받아온다.
		// 2. 소수를 넣어줄 변수를 새로 만들어준다.
		// 3. while문안에 for문을 돌려서 num을 나눠줄 i가 소수인지 먼저 구한다.
		// 4. 그 후, i가 소수이면서 num의 약수일 때 prime에 i를 넣어주고 소인수분해한다.
		// 5. num이 prime보다 작아지면 그대로 break한다.

		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();

		int num = sc.nextInt();
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			while(num % i == 0) {
				System.out.println(i);
				num /= i;
			}
		}
		
		if (num != 1) {
			System.out.println(num);
		}
	}
}