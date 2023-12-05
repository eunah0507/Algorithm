import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 
		// 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 문제
		
		// 1. 테스트케이스 String으로 받아온다.
		// 2. int abc = 26으로 받아온다. (필요없었음)
		// 3. 새로운 배열 char배열을 만들어준다(틀림) 새로운 int 배열안에 넣어준다.
		// 4. for문을 abc.length()까지 돌린다.
		// 5. 새로운 int 변수를 만들어 str의 문자위치에 새로운 값을 넣는다.
		// 6. 새로운 char 변수를 만들어서 배열 arr의 순서를 abc순서로 바꿔준다.
		// 7. 바꿔준 arr의 순서에 str의 위치값을 넣어준다. 단, 조건문을 사용해서 arr의 값이 -1일때만 넣어준다.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int [] arr = new int [26];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		for (int i = 0; i < str.length(); i++) {
			int strIndex =  i; //해당 문자열의 위치
			char strChar = str.charAt(i); //i의 문자를 하나씩 뽑아온다.
			int arrIndex = strChar - 'a'; //i의 문자를 아스키코드화 하는 것
			if (arr[arrIndex] == -1) { // arrIndex가 -1이면, 
				arr[arrIndex] = strIndex; // 알파벳 순서위치에 문자열위치를 넣어주겠다.
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
