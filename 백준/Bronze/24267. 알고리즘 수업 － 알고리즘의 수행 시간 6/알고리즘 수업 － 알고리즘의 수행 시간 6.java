import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 이차복잡도와 비슷한 시간복잡도 문제 풀기
		
//		 O(n X (n-1) X (n-2)/6)
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long answer = 0;
		
		answer = (a * (a - 1) * (a - 2) /6);
		
		System.out.println(answer);
		System.out.println(3);
	}
}