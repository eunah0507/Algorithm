import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 문제.
		
		// 1. 테스트케이스 int를 받아온다.
		// 2. 테스트케이스 String을 받아온다.
		// 3. for문을 돌려서 int만큼 돌린다. 
		// 4. String을 charAt을 통해 하나씩 받아서 새로운 int에 넣어준다.
		// 5. parseInt를 통해 int로 변환해준다.
		// 6. 새로운 int에 +=해준다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String str = sc.next();
		int answer = 0;
		
		for (int i = 0; i < num; i++) {
			String one = "" + str.charAt(i);
			answer += Integer.parseInt(one);
		}
		
		System.out.println(answer);
	}
}
