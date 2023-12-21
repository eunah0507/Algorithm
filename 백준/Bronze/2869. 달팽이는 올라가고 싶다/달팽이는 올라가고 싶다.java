import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 달팽이가 V인 곳에서 낮에 A만큼 올라가고 밤에 B만큼 떨어지면 며칠 후 탈출하나?
		
		// 1. 테스트케이스 int를 3개 받아온다.
		// 2. while문을 돌린다.
		
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextInt();
		double B = sc.nextInt();
		double V = sc.nextInt();
		
		int day = (int) Math.ceil((V - B) / (A - B));
		
		System.out.println(day);

	}
}