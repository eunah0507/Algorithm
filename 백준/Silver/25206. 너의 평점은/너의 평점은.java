import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 인하대학교 다니는 치훈이는 졸업할 수 있는지

		// 1. 학점을 나눠줄 변수들을 받아온다.
		// 2. for문을 돌려서 테스트케이스 String, int, String을 받아온다.
		// 3. for문은 20번 돌린다.
		// 4. for문 안에 if문을 돌려서 P가 나오면 지나가고 아닐 경우에만 수를 부여해준다.
		// 5. 계산한다.
		// str = 과목명 , score = 전공학점 , abc = 내점수, total = 내 총 학점

		Scanner sc = new Scanner(System.in);

		float sum = 0;
		float div = 0;
		float total = 0;
		float change = 0;

		for (int i = 1; i <= 20; i++) {
			String str = sc.next();
			float score = sc.nextFloat();
			String abc = sc.next();

			if (abc.equals("P")) {
				continue; // 바로 다음 반복문으로 넘어가겠다. 아래 이어진 문장들을 시행하지 않겠다.
			} else if (abc.equals("A+")) {
				change = 4.5f;
			}else if (abc.equals("A0")) {
				change = 4.0f;
			}else if (abc.equals("B+")) {
				change = 3.5f;
			}else if (abc.equals("B0")) {
				change = 3.0f;
			}else if (abc.equals("C+")) {
				change = 2.5f;
			}else if (abc.equals("C0")) {
				change = 2.0f;
			}else if (abc.equals("D+")) {
				change = 1.5f;
			}else if (abc.equals("D0")) {
				change = 1.0f;
			}else if (abc.equals("F")) {
				change = 0;
			}
			
			sum += score * change;
			div += score;
		}
		total = sum / div;
		System.out.println(total);
	}
	
}