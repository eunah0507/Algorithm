import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 예를 들어, 세준이의 최고점이 70이고, 
		//  50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
		
		// 1. 테스트케이스 N을 받는다.
		// 2. 배열 N안에 성적 값을 받는다.
		// 3. 그 중, 최댓값을 찾는다.
		// 4. 각 값을 공식에 따라 바꿔준다.
		// 5. 평균을 구한 뒤, 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		float [] score = new float [N];
		float highscore = Integer.MIN_VALUE;
		float average = 0;
		
		for (int i = 0; i < N; i++) {
			score[i]=sc.nextInt();
			highscore = Math.max(highscore, score[i]);
		}
		for (int i = 0; i < N; i++) {
			float change = 0;
			change = score[i]/highscore*100;
			
			score[i] = change;
			average = average + score[i];
		}
		System.out.println(average/N);
	}
}
