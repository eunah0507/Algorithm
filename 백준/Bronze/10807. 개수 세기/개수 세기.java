import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
		// 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
		// 1. T개의 테스트케이스 2. 숫자 나열 3. 나열된 숫자중 찾아야하는 숫자
		
		// 1. 테스트케이스 n을 받아온다.
		// 2. n개만큼의 방을 만든다.
		// 3. n개만큼의 숫자를 배열에 저장한다.
		// 4. v값을 받아온다.
		// 5. count를 0으로 선언한다.(v를 찾기 위한)
		// 6. 배열을 다시 0번부터 n-1까지 검색하며 v랑 같은게 나올 때 마다 count를 1씩 증가한다.
		
		// 배열이란? 변수타입 [] 변수명 = new 변수타입 [숫자];
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int v = sc.nextInt();
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			if (arr[i] == v) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
