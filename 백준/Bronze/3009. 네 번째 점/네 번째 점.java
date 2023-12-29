import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		// 평행한 직사각형을 만들기 위해 좌표를 구하는 문제
		
		// 1. 테스트케이스 int 6개를 받아온다.
		// 2. 세 개의 테스트 케이스 중 x좌표를 비교해서 다른 값을 찾는다.
		// 3. 세 개의 테스트 케이스 중 y좌표를 비교해서 다른 값을 찾는다.
		// 4. 다른 값을 찾은 것을 변수에 넣어준다.
		// 5. 답을 출력할 변수 2개를 만든다.
		
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		int x4 = 0;
		int y4 = 0;
		
		if (x1 == x2) {
			x4 = x3;
		}else if(x1 == x3) {
			x4 = x2;
		}else if(x2 == x3) {
			x4 = x1;
		}
		
		if (y1 == y2) {
			y4 = y3;
		}else if(y1 == y3) {
			y4 = y2;
		}else if(y2 == y3) {
			y4 = y1;
		}
		
		System.out.print(x4 + " " + y4);
	}
}