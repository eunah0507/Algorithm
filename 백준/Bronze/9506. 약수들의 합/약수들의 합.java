import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 완전수를 구하는 문제
		
		// 1. 답을 출력할 answer 변수를 만들어준다.
		// 2. while문을 무한반복으로 돌리고 -1을 받으면 break한다.
		// 3. 테스트케이스 int를 받아온다.
		// 4. for문을 테스트케이스 만큼 돌려서 자기 자신보다 -1까지 돌린다.
		// 5. 나머지가 0인 경우 약수이므로 answer에 중첩해준다.
		// 5-1. if문을 사용해 약수를 모두 더한 값이 A와 같은지 비교한다.
		// 6. 같을 경우에만 answer에 A += 0 + 이렇게 받아온다.
		// 7. 완전수가 아니면 answer에 A is not perfect를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		String answer = "";
		int count = 0;
		
		while(sc.hasNext()) {
			int A = sc.nextInt();
			answer = A + " = ";
			count = 0;
			if (A == -1) {
				break;
			}else {
				for (int i = 1; i < A; i++) {
					if (A % i == 0) {
						count += i;
						answer += i + " + ";
					} 
				}
				
				if(A != count) {
					answer = A + " is NOT perfect.";
				} else {
					answer = answer.substring(0, answer.length()-3);
				}
			}
			System.out.println(answer);
		}
	}
}