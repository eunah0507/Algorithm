import java.util.HashMap;
import java.util.Scanner;

public class HashMap_01 {
	public static void main(String[] args) {
		
		// 투표용지에서 가장 많이 나온 후보 출력하기
		
		// 1. 테스트케이스 int, String을 받아온다.
		// 2. 답을 출력할 char를 만들어준다.
		// 3. HashMap을 만들어 forEach문을 돌려 값을 채워준다.
		// 4. forEach문을 돌려 그 중 key값이 높은 후보를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		char answer = ' ';
		int max = Integer.MIN_VALUE;
		
		HashMap<Character, Integer> voteMap = new HashMap<>();
		
		for (char ch : str.toCharArray()) {
			// ch의 key와 value를 채우겠다. value값이 없으면 0 +1 하겠다.
			voteMap.put(ch, voteMap.getOrDefault(ch, 0)+1);
		}
		
		for (char key : voteMap.keySet()) {
			if (voteMap.get(key) > max) {
				max = voteMap.get(key);
                answer = key;
			}
		}
		
		System.out.println(answer);
	}
}
