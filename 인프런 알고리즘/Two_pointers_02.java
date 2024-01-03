import java.util.*;

public class Two_pointers_02 {
	public static void main(String[] args) {

		// 두 배열 중, 공통된 값만 오름차순으로 출력하는 문제
		
		// 1. 테스트케이스 int 2개를 각각 받아와서 배열을 채워준다.
		// 2. 값을 비교할 변수 2개를 받아온다.
		// 3. 답을 출력할 answer를 ArrayList로 받아온다.
		// 4. 배열 2개를 먼저 오름차순으로 정리해준다.
		// 5. while문과 if문을 이용해서 공통된 값을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int [] b = new int[m];
		
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		
		int p1 = 0;
		int p2 = 0;
		
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(a);
		Arrays.sort(b);
		
		while(p1 < n && p2 < m) {
			if (a[p1] == b[p2]) {
				answer.add(a[p1++]);
				p2++;
			}else if(a[p1] < b[p2]) {
				p1++;
			}else {
				p2++;
			}
		}
		
		for (Integer integer : answer) {
			System.out.print(integer + " ");
		}
	}
}
