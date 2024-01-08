import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMap_03 {
	public static void main(String[] args) {

		// 연속된 k일동안, 몇 종류의 매출액이 있는지 찾는 문제
		
		// 1. 테스트케이스 int를 2개 받는다.
		// 2. 배열을 만들어 채워준다.
		// 3. 답을 출력할 List를 만든다.
		// 4. 답을 구할 HashMap을 만든다.
		// 5. Two pointer로 진행하면서, rt를 먼저 확장시키고, 
		//    그 다음 lt를 늘려나가면서 사이즈를 구한다.
		// 6. 각 윈도우마다 size()를 List()에 넣어준다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int k = sc.nextInt();
		// Two pointer 하기 위한 변수
		int lt = 0;
		int [] arr = new int[num];
		
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		// lt를 증가시키기 위해 k-1로 잡는다.
		for (int i = 0; i < k-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		
		// rt를 증가시키기 위해 k-1부터 num까지 범위를 잡는다.
		for (int rt = k-1; rt < num; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			// 매출액의 종류를 출력하는거니까 size()를 출력
			answer.add(map.size());
			// lt를 증가시키므로 size()에 들어갔던 lt값 하나 빼줌
			map.put(arr[lt], map.get(arr[lt])-1);
			
			// 만약, lt값이 하나밖에 없다면 빼고 나서는 0만 남는다. 
			// 그럴경우엔 아예 제거(size는 0도 잡는다.)
			if (map.get(arr[lt]) == 0) {
				map.remove(arr[lt]);
			}
			
			// 모든 대입이 끝난 후에 lt를 증가시킨다.
			lt++;
		}
		
		for (Integer integer : answer) {
			System.out.print(integer + " ");
		}
	}
}
