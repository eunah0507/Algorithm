import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		// 꼭짓점 n개를 받았을 때, 직사각형 넓이 구하기
		
		// 1. 테스트케이스 int를 받는다.
		// 2. minX,maxX,minY,maxY,totalX,totalY값을 채울 변수를 만든다. 
		// 3. for문을 int 만큼 돌려서 나머지 숫자를 받아온다.
		// 4. 최소값, 최대값을 각각 구한다.
		// 5. x의 최대값 - 최소값, y의 최대값 - 최소값을 구해서 곱해준다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int minX = Integer.MAX_VALUE;
		int maxX = Integer.MIN_VALUE;
		int minY = Integer.MAX_VALUE;
		int maxY = Integer.MIN_VALUE;
		int totalX = 0;
		int totalY = 0;
		int answer = 0;
		
		for (int i = 0; i < num; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			minX = Math.min(minX, x);
			maxX = Math.max(maxX, x);
			minY = Math.min(minY, y);
			maxY = Math.max(maxY, y);
			
			totalX = maxX - minX;
			totalY = maxY - minY;
			
			answer = totalX * totalY;
		}
		
		System.out.println(answer);
	}
}