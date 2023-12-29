import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		// 경계선까지 가는 최소값 구하기
		
		// 1. 테스트케이스 int를 4개 받아온다.
		// 2. 최소값 변수를 만들어준다.
		// 3. 절대값 메서드 Math.abs()를 사용해서 4가지 경우의 수를 구한다.
		// 4. 구한 절대값을 Math.min()을 이용해 최소값을 구한다.
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int answer = Integer.MAX_VALUE;
		
		int absX = 0;
		int absY = 0;
		int absW = 0;
		int absH = 0;
		
		absX = Math.abs(0 - x);
		absY = Math.abs(w - x);
		absW = Math.abs(0 - y);
		absH = Math.abs(h - y);
		
		List<Integer> list = new ArrayList<>();
		
		list.add(absX);
		list.add(absY);
		list.add(absW);
		list.add(absH);
		
		for (Integer min : list) {
			answer = Math.min(answer, min);
		}
		
		System.out.println(answer);
	}
}