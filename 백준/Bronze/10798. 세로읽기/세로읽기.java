import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 5 * n 개의 격자판에 나오는 숫자+문자들을 세로로 출력하기
		
		// 1. 배열을 만들어준다. 5행, 최대 15열이므로 [5][15]로 만든다.
		// 2. 변수 String를 하나 받아온다.
		// 3. for문을 돌려 값을 채워준다.
		// 4. arr[i][j]값을 charAt으로 뽑아준다.
		// 5. for문을 빠져나와 새로운 for문을 돌려서 answer에 중첩해준다.
		
		Scanner sc = new Scanner(System.in);
		
		String c = "";
		String answer = "";
		String [][] arr = new String[5][15];
		
		for (int i = 0; i < 5; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < str.length(); j++) {
				arr[i][j] = "" + str.charAt(j);
			}
		}
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j][i] != null) {
					answer += arr[j][i];
				}
			}
		}
		
		System.out.println(answer);
	}
}