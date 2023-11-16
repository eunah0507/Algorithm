import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/* 생뚱맞게 혜아는 문제를 풀다가 int 앞에 long을 붙일 생각을 한다.
		 * long은 4단위로 묶여 쓸 수 있다. 예를들면 4 = long int, 8=long long int이다. */
		
	
		//1. 혜아가 생각한 단위의 숫자를 받아온다.
		//2. 숫자 x를 4로 나누어 값이 1 증가할 때 마다 long 을 붙여준다.
		//3. long을 다 붙이고 난 후에는 기본값 int를 붙여준다.
		
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String answer = "int";
		
		for (int i = 1; i < x; i=i+4) {
			answer = "long " + answer;
		}
		
		System.out.println(answer);
	}
}
