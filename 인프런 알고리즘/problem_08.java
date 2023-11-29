import java.util.Scanner;

public class problem_08 {
	public static void main(String[] args) {

		// 펠린드롬 = 앞으로 읽으나 뒤로 읽으나 같은 문자열
		
		// 1. 테스트케이스를 string으로 받아온다.
		// 2. 테스트케이스를 모두 대문자화해주고, 숫자나 기호는 replaceAll을 사용하여 모두 대체해준다.
		// 3. 새로운 string을 받아 stringbuilder.reverse를 사용해 비교해준다.
		// 4. if문을 사용해 펠린드롬이 맞으면 yes를 호출하고, 아니면 no를 호출한다.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String answer = "";
		
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		
		String tmp = new StringBuilder(str).reverse().toString();
		//StringBuilder은 정확하게는 string이 아니라서 toString으로 변환해준다.
		if (str.equals(tmp)) {
			answer = "YES";
		}else {
			answer = "NO";
		}
		System.out.println(answer);
	}
}
