import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 이차복잡도와 비슷한 시간복잡도 문제 풀기
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		long b = a * (a-1) / 2;
		
		System.out.println(b);
		System.out.println(2);
		
	}
}