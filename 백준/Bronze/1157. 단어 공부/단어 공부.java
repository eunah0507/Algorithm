import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 문제

		// 1. 테스트케이스 String을 받아온다.
		// 2. toUppercase()를 통해 모두 대문자화한다.
		// 3. charAt()을 써서 한글자씩 뽑아낸다.
		// 4. 알파벳 개수만큼인 26개의 배열을 만든다.
		// 4. for문을 str.length()만큼 돌려서 해당 알파벳이 들어있을 때 마다 배열에 +1해준다.
		// 5. for문을 돌려서 알파벳 개수 배열중 가장 큰 값을 출력한다.

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		str = str.toUpperCase();
		int[] arr = new int[26];

		for (int i = 0; i < str.length(); i++) {// EWR
			char c = str.charAt(i); // A~Z
			int abc = c - 'A';
			arr[abc]++;
		}

		int max = Integer.MIN_VALUE;
		char change = ' ';

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				change = (char)('A' + i); //강제 형변환 , 알파벳 위치를 반환해주는 것.
			}else if(arr[i] == max) {
				max = arr[i];
				change = '?';
			}
		}
		System.out.println(change);
	}
}