import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // N만큼의 무게를 3,5 봉지에 나눠 담되, 최소의 봉지로 나눠담는 문제

        // 1. 테스트케이스 int를 받는다.
        // 2. for문을 num만큼 돌린다.
        // 3. if문을 사용해서 5로 먼저 나누고 나머지를 3으로 나눈다??
        // 4. 최소인지 비교한다.

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int answer = 0;

        while (true) {
            if (num % 5 == 0) {
                answer += (num / 5);
                break;
            }

            num -= 3;
            answer++;

            if (num < 0){
                answer = -1;
                break;
            }
        }

        System.out.println(answer);
    }
}