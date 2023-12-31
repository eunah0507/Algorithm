import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의한다.
		
		// 1. 바로 while문을 돌려서 값을 받아온다.
		// 2. 0 0 0 이 들어오면 종료한다.
		// 3. 가장 큰 값을 찾아서 max에 넣어준다.
		// 4. max * 2 >= a+b+c여선 안되니까 값을 넣어준다.
		// 5. 그 외 조건을 충족시킨다.
		
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int max = 0;
			max = Math.max(a, b);
			max = Math.max(max, c);
			
			if (a == 0 && b == 0 && c == 0) {
				break;
			} else if (max * 2 >= a + b + c) {
				System.out.println("Invalid");
			} else if (a == b && b == c) {
				System.out.println("Equilateral");
			} else if (a == b || b == c || a == c) {
				System.out.println("Isosceles");
			} else if (a != b && b != c) {
				System.out.println("Scalene");
			}
		}
	}
}