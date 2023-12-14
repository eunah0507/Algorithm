import java.util.Scanner;

public class Array_1_2_problem_10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int [][] arr = new int [num][num];
		int answer = 0;
		int [] dx = {-1, 0, 1, 0};
		int [] dy = {0, -1, 0, 1};
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				arr [i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				boolean flag = true;
				for (int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					if (nx >= 0 && nx <num && ny >= 0 && ny < num && arr[i][j] <= arr[nx][ny] ) {
						flag = false;
						break;
					}
				}
				if(flag) {
					answer ++;
				}
			}
		}
		System.out.println(answer);
	}
}
