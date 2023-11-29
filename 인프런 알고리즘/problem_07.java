import java.util.Scanner;

public class problem_07 {
	public static void main(String[] args) {

		// 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 문제
		
		// 1. 테스트케이스 string을 받아온다.
		// 2. indexOf를 사용하여 중복된 문자열을 제거한다.
		//	  (indexOf = 문자열(string)에서 특정 문자열(searchvalue)을 찾고, 
		//	             검색된 문자열이 '첫번째'로 나타나는 위치 index를 리턴
		// 3. for문을 str.length만큼 받아온다.
		// 4. if문을 돌려 indexOf를 사용하여 charAt으로 문자가 처음으로 나왔을 때만 출력하게 한다.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String answer = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i))==i) {
				answer += str.charAt(i);
			}
		}
		System.out.println(answer);
	}
}
