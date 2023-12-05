import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 입력 받은 대로 출력하는 문제
		
		// 1. 테스트케이스 String을 받아온다. (틀림)
		// 2. 그대로 출력한다? (틀림) for문을 순차적으로 받아오나?(틀림)
		// 2. while문을 돌려서 그 안에서 테스트케이스 String을 받아온다.
		// 3. 그리고 출력한다.
		// 4. if문을 사용해서 str이 null이 될 경우 break한다.
		
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			System.out.println(str);
			
			if (str == null) {
				break;
			}
		}
	}
}
