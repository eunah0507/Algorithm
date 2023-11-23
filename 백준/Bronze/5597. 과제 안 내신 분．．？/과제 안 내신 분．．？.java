import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
		
		// 1. boolean을 이용한다.
		// 2. 기본값이 false인 arr에 입력받는 숫자가 있으면 true로 바꿔준다.
		// 3. for문을 30번을 돌려서 false인 것만 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		boolean [] arr = new boolean [30+1];
		
		for (int i = 1; i <= 28; i++) {
			arr[sc.nextInt()] = true;
		}
		
		for (int i = 1; i <= 30; i++) {
			if (arr[i] == false) {
				System.out.print(i + " ");
			}
		}
	}
}
