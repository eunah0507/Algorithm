import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// contain()을 통해서 문자를 추출하고, 길이를 세는 문제
		
		// 1. 테스트케이스 String을 nextLine()을 받아온다.
		// 2. if문을 돌려 contain()을 통해 해당 문자가 존재하는지 찾는다.
		// 3. 맞으면 해당 문자를 다른 문자로 바꿔준다.
		// 4. else if문을 돌리는 것이 아니라, 독립된 if를 계속 돌린다.
		// 5. 모두 바꿔준 후, 길이를 세준다.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		if(str.contains("c=")) {
			str = str.replace("c=", "a");
		}
		
		if(str.contains("c-")) {
			str = str.replace("c-", "a");
		}
		
		if(str.contains("dz=")) {
			str = str.replace("dz=", "a");
		}
		
		if(str.contains("d-")) {
			str = str.replace("d-", "a");
		}
		
		if(str.contains("lj")) {
			str = str.replace("lj", "a");
		}
		
		if(str.contains("nj")) {
			str = str.replace("nj", "a");
		}
		
		if(str.contains("s=")) {
			str = str.replace("s=", "a");
		}
		
		if(str.contains("z=")) {
			str = str.replace("z=", "a");
		}
		
		System.out.println(str.length());
	}
}