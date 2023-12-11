import java.util.Scanner;

public class Array_1_2_problem_02 {
	public static void main(String[] args) {
		// 선생님이 맨 앞에서 봤을 때, 몇 명이 보이나?
		
		// 1. 테스트케이스 int를 받아온다.
		// 2. int를 배열안에 넣어준다.
		// 3. 변수 answer와 max를 받아온다.
		// 4. for문을 돌려 배열 값을 채워준다.
		// 5. if문을 돌려 arr[i]>max일 때, answer++해준다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int answer = 1;
		int [] arr = new int[num];
		int max = arr[0];
		
		for (int i = 1; i < num; i++) {
			arr[i]=sc.nextInt();
			if (arr[i]>max) {
				answer ++;
				max = arr[i];
			} 
		}
		System.out.println(answer);
	}
}
