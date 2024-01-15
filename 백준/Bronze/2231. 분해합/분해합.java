import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 가장 작은 생성자 구하기 문제

        // 1. 테스트케이스 int를 받는다.
        // 2. 답을 출력할 answer 변수를 만든다.
        // 3. for문을 0~n까지 만들고, 그 안에 while문을 만든다.
        // 4. while문 안에 n을 1로 나눈 나머지, 10으로 나눈 나머지, 100으로 나눈 나머지들을 구한다.
        // 4-1. 값이 0이 되면 break;한다.
        // 5. if문을 사용해서 나머지들을 다 더한 값이 테스트케이스와 맞는지 비교한다.
        // 6. 0부터 시작하니까 어차피 처음 구한 값이 제일 작으니까 출력한다.

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int answer = 0;

        // num-1까지 i를 돌리면서 답을 구하겠다.
        for (int i = 0; i < num; i++) {
            // 무한반복을 방지하기 위해 변수 tmp를 만든다.
            int tmp = i;
            // 분해합을 더할 변수를 만든다.
            int sum = 0;
            // 특정 조건에서만 break되도록 돌린다.
            while (true) {
                // 조건이 끝나고 새로 시작할 때, tmp가 0이면 그냥 종료하겠다.
                if (tmp == 0) {
                    break;
                } else {

                    // sum에 tmp를 1로 나눈 나머지를 더하겠다.
                    sum += (tmp % 10);
                    // 그 후, tmp를 10으로 나눈다.
                    // 그 다음엔, while을 계속 돌리면서 반복한다.
                    tmp = tmp / 10;
                }
            }

            // ex.198이면? 1+9+8+198을 해야하는데 1+9+8은 while문에서 했으니까
            // 나머지 +198을 하기 위해서 sum += i를 한다.
            sum += i;

            // 만약, sum == num과 같다면 i를 answer에 넣어 출력한다.
            if (sum == num) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}