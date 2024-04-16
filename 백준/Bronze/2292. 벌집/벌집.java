import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		int c = 1; // 겹 수(최소 루트)
		int r = 2;	// 범위 (최솟값 기준) 
 
		if (N == 1) {
			System.out.print(1);
		}
 
		else {
			while (r <= N) {	// 범위가 N보다 커지기 직전까지 반복 
				r = r + (6 * c);	// 다음 범위의 최솟값으로 초기화 
				c++;	// c 1 증가 
			}
			System.out.print(c);
		}
	}
}