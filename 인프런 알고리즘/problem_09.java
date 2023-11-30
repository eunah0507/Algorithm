import java.util.Scanner;

public class problem_09 {
	public static void main(String[] args) {
		
		// 1. 테스트케이스 String 을 받아온다.
		// 2. int answer을 0으로 받아온다.
		// 3. for문을 돌려서 String이 숫자일 경우 answer에 더해준다.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int answer = 0;
		
		for (char i : str.toCharArray()) {
			if (i>=48 && i<=57) {
				answer = answer * 10 + (i-48);
			}
		}
		
		/*
		 * char [] c = str.toCharArray();
		 * 
		 * for (char i : c) { if (i >= '0' && i<= '9') { answer = answer * 10 + (i-'0');
		 * } } System.out.println(answer);
		 */
	}
}
