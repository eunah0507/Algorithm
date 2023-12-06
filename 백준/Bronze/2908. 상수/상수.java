import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 두 수가 주어졌을 때, 상수의 대답을 출력하는 문제
		
		// 1. 테스트케이스 int를 받아온다.(틀림)
		// 2. 테스트케이스 두 개를 String으로 받아온다.(StringBuffer사용해야 해서)
		// 3. reverse를 통해 두 int를 뒤집어준다.
		// 4. 두 수를 비교해서 큰 수를 출력해준다.
		// 개 얌 체 같은 문제다.. String으로 받아서 StringBuffer로 바꿔주고 그걸 또 String으로 바꿔주고 그걸 또 int로 바꿔서..
		
		Scanner sc = new Scanner(System.in);
		
		String one = sc.next();
		String two = sc.next();
		
		StringBuffer str = new StringBuffer(one);
		StringBuffer stb = new StringBuffer(two);
		
		str = str.reverse();
		stb = stb.reverse();
		
		one = str.toString();
		two = stb.toString();
		
		int answer = Integer.parseInt(one);
		int answer2 = Integer.parseInt(two);
		
		//if (answer > answer2) {
		//		System.out.println(answer);
		//	} else{
		//		System.out.println(answer2);
		//	}
		
		int realanswer = Math.max(answer, answer2);
		
		System.out.println(realanswer);
		
	}
}