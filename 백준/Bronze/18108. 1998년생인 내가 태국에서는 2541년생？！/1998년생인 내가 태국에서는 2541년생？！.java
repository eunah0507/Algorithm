import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 불기 연도를 서기 연도로 변환하기
		// ex. 2541 > 1998 출력
		
		Scanner sc = new Scanner(System.in);
		
		int A;
		A = sc.nextInt();
		
		int answer;
		
		answer = A-543;
		
		System.out.println(answer);
		
	}
}
