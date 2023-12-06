import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 문제
		
		// 1. 테스트케이스 String을 받아온다.
		// 2. 새로운 변수 int를 받아온다.
		// 3. charAt으로 변환해준다.
		// 4. for문으로 순회하면서 띄어쓰기가 있을때마다 int값을 증가시킨다.
		// 5. 얌체같이 앞뒤로도 띄어쓰기를 입력받아야하니까 trim을 넣어서 앞뒤 공백을 없애준다.
		// 6. int +1 해서 출력한다.
		// 7. 얌체같이.. " "만 입력되면 0이 출력되어야한다.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		str = str.trim(); //앞뒤 공백을 없애줌
		int cnt = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if (c == ' ') {
				cnt ++;
			}
		}
		
		cnt++;
		
		if (str.equals("")) { //String이라서 ==을 사용할 수 없다. str.equals(비교할대상)을 쓴다.
			cnt = 0;
		}
		
		System.out.println(cnt);
		
	}
}