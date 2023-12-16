import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 그룹단어가 있다면 cnt ++ 해주는 문제
		
		// 1. 테스트케이스 int를 받아온다.
		// 2. 테스트케이스 String을 받아온다.
		// 3. 크기가 26인 배열을 만든다.
		// 4. 변수 cnt를 만들어준다.
		// 5. for문 안에 if문을 돌려서 해당 단어 하나씩 쪼갠 뒤, 일치하면 1씩 증가시킨다.
		// 6. 배열의 숫자가 2가 되는 순간 종료한다.
		// 7. 배열의 숫자가 모두 1이거나 0일 때는 cnt++해준다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int cnt = 0;
		
		for (int i = 0; i < num; i++) {
			String str = sc.next();
			char c = '@';
			
			int [] arr = new int [26];
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) != c) {
					c = str.charAt(j);
					arr[c-'a']++;
				}
			}
			
			boolean flag = true;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > 1) {
					flag = false;
				}
			}
			
			if (flag) {
				cnt ++;
			}
		}
		
		System.out.println(cnt);
	}
}