import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		// 세로 길이가 A cm, 가로 길이가 B cm 직사각형의 넓이 문제
		
		// 1. 테스트케이스 int를 2개 받는다
		// 2. 넓이를 구할 변수를 만든다.
		// 3. A*B 해준다.
		// 4. 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int answer = 0;
		
		answer = A * B;
		
		System.out.println(answer);
		
	}
}