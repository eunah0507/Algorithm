import java.util.Scanner;

public class Array_1_2_problem_08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int [] arr = new int [num];
		int cnt = 0;
		int [] answer = new int[num];
		
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num; i++) {
			cnt = 1;
			for (int j = 0; j < num; j++) {
				if (arr[j] > arr[i]) {
					cnt ++;
				}
				answer[i] = cnt;
			}
		}
		for (int i = 0; i < num; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}
