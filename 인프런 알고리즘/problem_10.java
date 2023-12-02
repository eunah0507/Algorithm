import java.util.Scanner;

public class problem_10 {
	public static void main(String[] args) {
		
		// 1. 테스트케이스 String 을 받아온다.
		// 2. 문자열 target을 받아온다.
		// 3. 거리열 place를 받아온다.
		// 4. 배열을 만들고 String을 넣어준다.
		// 5. for문을 돌려 target을 만나면 p를 0으로 설정한다.
		// 6. target을 만나지 못하면 p를 1씩 증가시킨다.
		// 7. 반대쪽으로도 한 번 더 for문을 돌리고, 이 때 Math.min값으로 적은 값을 넣어준다.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char target = sc.next().charAt(0);
		int place = 1000;
		
		int [] answer = new int[str.length()];
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target) {
				place = 0;
				answer[i] = place;
			}else {
				place++;
				answer[i] = place;
			}
		}
		
		place = 1000;
		
		for (int i = str.length()-1; i >= 0; i--) {
			if (str.charAt(i) == target) {
				place = 0;
				answer[i] = place;
			}else {
				place ++;
				answer[i] = Math.min(place, answer[i]);
			}
		}
		
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}
