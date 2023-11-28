import java.util.Scanner;

public class problem_03 {
	public static void main(String[] args) {
		
		// 문장 중, 가장 긴 단어를 출력하라
		
		// 1. 테스트케이스 String str을 받아온다.
		// 2. 출력할 답 answer를 string으로 받아온다.
		// 3. 비교를 위해 최소값 m을 선언해준다.
		// 4. foreach문으로 line을 비교한다.
		// 5. 단어 길이를 알기 위해 int length을 선언하고 거기에 넣으면서 비교한다.
		// 6. 답을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String answer = "";
		int m = Integer.MIN_VALUE;
		
		String[] line = str.split(" "); // 띄어쓰기를 제외하고 단어들을 배열에 순차적으로 넣어주는 메서드
		
		for (String i : line) {
			int length=i.length();
			if (length > m) {
				m = length;
				answer = i;
			}
		}
		System.out.println(answer);
	}
}
