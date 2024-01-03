import java.util.ArrayList;
import java.util.Scanner;

public class Two_pointers_01 {
	public static void main(String[] args) {
		
		// 두 배열을 오름차순으로 합치는 문제
		
		// 1. 테스트케이스 int 를 2개 받아서 for문을 돌려 배열을 채워준다.
		// 2. 값을 비교할 변수 2개를 만들어준다.
		// 3. if문을 돌려 두 배열의 값을 비교해 적은 수를 정답 배열에 채워준다.
		// 4. 두 배열 중, 먼저 한 배열이 끝날 경우, 나머지 배열을 그대로 넣어준다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] a = new int [n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int [] b = new int [m];
		
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		
		int p1 = 0;
		int p2 = 0;
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		while(p1 < n && p2 < m) {
			if (a[p1] < b[p2]) {
				answer.add(a[p1++]);
			}else {
				answer.add(b[p2++]);
			}
		}
		
		while(p1 < n) {
			answer.add(a[p1++]);
		}
		
		while(p2 < m) {
			answer.add(b[p2++]);
		}
		
		for (Integer str : answer) {
			System.out.print(str.toString() + " ");
		}
	}
}
