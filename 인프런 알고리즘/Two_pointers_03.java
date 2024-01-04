import java.util.Scanner;

public class Two_pointers_03 {
	public static void main(String[] args) {

		// 슬라이딩 윈도우를 사용해서 연속된 n의 최대값을 찾는 문제

		// 1. 테스트케이스 n, k을 받아온다.
		// 2. 배열을 만들고 for문을 돌려 n의 값을 채워준다.
		// 3. 변수 sum과 answer를 만든다.
		// 4. for문을 i부터 k까지 돌려 sum의 값을 채운다.
		// 5. 다시 for문을 돌려 k부터 n까지 sum의 값을 바꿔준다.
		// 6. answer에 Math.max()를 이용해서 최대값을 찾아준다.

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		int answer = 0;

		for (int i = 0; i < k; i++) {
			sum += arr[i];
			answer = sum;
		}
		for (int j = k; j < n; j++) {
			sum += (arr[j] - arr[j - k]);
			answer = Math.max(answer, sum);
		}

		System.out.println(answer);
	}
}
