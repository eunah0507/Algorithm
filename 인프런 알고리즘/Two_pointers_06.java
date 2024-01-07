import java.util.Scanner;

public class Two_pointers_06 {
	public static void main(String[] args) {
		// 앞의 문제를 수학 공식을 이용해서 다시 풀어보기
		
		// 1. 테스트케이스 int를 받아온다.
		// 2. 변수 answer와 cnt를 만들어준다.
		// 3. n--; 해준다.
		// 4. while문을 n>0일 때 돌려준다.
		// 5. while문 안에서 cnt++해주고, n=n-cnt해준다.
		// 6. if문을 돌려 n%cnt == 0 이면 answer++한다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int answer = 0;
		// 약수 시작은 1부터니까 1로 초기값을 준다.
		int cnt = 1;
		
		// cnt = 1이기 때문에 n-- 한다.
		n--;
		while(n > 0) {
			// while문이 돌아가는 동안 cnt를 증가시킨다.
			cnt++;
			// n에서 cnt를 빼주고, cnt로 나눴을 때 나머지가 0이어야 덧셈이 맞다.
			n=n-cnt;
			if (n%cnt == 0) {
				answer++;
			}
		}
		
		System.out.println(answer);
		
	}
}
