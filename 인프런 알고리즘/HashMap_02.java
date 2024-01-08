import java.util.HashMap;
import java.util.Scanner;

public class HashMap_02 {
	public static void main(String[] args) {

		// 길이가 같은 두 문자열이 같은 구성인지 판단하는 문제

		// 1. 테스트케이스 String을 2개 받는다.
		// 2. 답을 출력할 변수 String을 만든다.
		// 3. hashmap을 만든다.
		// 4. forEach문을 돌려 key, value값을 넣는다. 문자 하나당 1씩 추가한다.
		// 5. 다시 forEach문을 돌려서 이번에는 문자 하나당 1씩 빼준다.
		// 6. if문을 돌려 0이 아니거나 밸류값을 갖고 있다면 No, 아니면 yes를 출력한다.

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		String str2 = sc.next();
		String answer = "YES";

		HashMap<Character, Integer> map = new HashMap<>();

		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (char ch : str2.toCharArray()) {
			if (!map.containsKey(ch) || map.get(ch) == 0) {
				answer = "NO";
				break;
			}

			map.put(ch, map.get(ch) - 1);
		}

		System.out.println(answer);
	}
}
