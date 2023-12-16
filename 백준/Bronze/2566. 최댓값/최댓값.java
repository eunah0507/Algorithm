import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 9*9 격자판에 주어진 수 중, 최댓값을 찾는 문제
		
		// 1. 9*9 배열을 만들어준다.
		// 2. for문을 돌려서 값을 채워준다.
		// 3. 최대값을 찾아준다.
		// 4. 최대값의 위치를 찾아줘야한다.
		
		Scanner sc = new Scanner(System.in);
		
		int [][] arr = new int [9][9];
		int max = Integer.MIN_VALUE;
		int col = 0;
		int row = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
				max = Math.max(max, arr[i][j]);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == max) {
					// 문제는 1열부터 시작하는데, 배열은 0부터 시작하니까 각 값에 1씩 더한다.
					col = i+1;
					row = j+1;
				}
			}
		}
		System.out.println(max);
		System.out.print(col + " " + row);
	}
}