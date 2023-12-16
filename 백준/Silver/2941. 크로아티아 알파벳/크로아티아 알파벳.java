import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// contain()을 통해서 문자를 추출하고, 길이를 세는 문제
		
		// 1. 테스트케이스 String을 nextLine()을 받아온다.
		// 2. String을 배열로 만들고, 값을 직접 넣어준다.
		// 3. for문을 돌린 후 if문을 돌려 값을 모두 a로 변환해준다.
		// 4. str.length()를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String [] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for (int i = 0; i < arr.length; i++) {
			if (str.contains(arr[i])) {
				str = str.replace(arr[i], "a");
			}
		}
		
		System.out.println(str.length());
	}
}