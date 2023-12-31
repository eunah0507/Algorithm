import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 이차복잡도 시간복잡도 문제 풀기
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		//Math.pow()는 double이라서 강제 형변환을 해준다.
		long b = (long)Math.pow(a, 2);
		
		System.out.println(b);
		System.out.println(2);
	}
}