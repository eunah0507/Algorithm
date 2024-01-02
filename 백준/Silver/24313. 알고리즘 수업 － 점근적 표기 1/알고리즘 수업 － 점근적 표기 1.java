import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// f(n) < g(n)일 경우 1, 아니면 0
		
		// 1. 테스트케이스 int 4개를 받아온다.
		// 2. 답을 출력할 변수 answer를 받는다.
		// 3. if문을 사용해 문제를 푼다.
		
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int a0 = sc.nextInt();
		int c = sc.nextInt();
		int n0 = sc.nextInt();
		int answer = 0;
		
		if ((a1*n0)+a0 <= c*n0 && c >= a1) {
			answer = 1;
		}else {
			answer = 0;
		}
		
		System.out.println(answer);
		
	}
}