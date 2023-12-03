import java.util.Scanner;

public class problem_12 {
	public static void main(String[] args) {
		
		// 1.테스트케이스 int와 String을 받아온다.
		// 2. answer를 String으로 받아온다.
		// 3. for문을 돌려 테스트케이스 int까지만 돌린다.
		// 4. 새로운 String tmp값을 만들어 그 안에 7개씩 끊어 값을 넣어준다.
		// 5. 끊은 값을 parseInt를 통해 2진수로 변환해준다.
		// 6. 2진수로 변환된 값을 char를 통해 아스키코드로 바꿔 출력한다.
		// 7. 다음 2진수 변환을 위해 7개씩 다시 끊어오도록 한다.
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * int n = sc.nextInt(); String str = sc.next(); String answer = "";
		 * 
		 * for (int i = 0; i < n; i++) { String tmp = str.substring(0, 7).replace('#',
		 * '1').replace('*', '0'); int num = Integer.parseInt(tmp, 2); answer +=
		 * (char)num; str = str.substring(7); } System.out.println(answer);
		 */
		
		// 1. 테스트케이스 String을 받아오고
		// 2. String answer를 만들고 초기값 "" 를 준다.
		// 2. for문을 돌리는데 String.length()만큼 돌린다.
		// 3. charAt()을 통해서 한글자씩 아스키코드로 변형해준다.
		// 4. 아스키코드 값을 replace를 통해 0은 *로, 1은 #으로 써준다.
		// 5. 그 값을 answer에 중첩해둔다.
		// 6. 출력한다.
		
		String str = sc.next();
		String answer = "";
		
		for (int i = 0; i < str.length(); i++) {
			int tmp = str.charAt(i);
			String rep = Integer.toBinaryString(tmp);
			rep = rep.replace('1', '#').replace('0', '*');
			answer += rep;
		}
		
		System.out.println(answer);
	}
}
