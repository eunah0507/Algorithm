import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // M장의 카드를 받아, N이하의 최대크기를 출력하는 문제

        // 1. 테스트케이스 int 2개를 받는다.
        // 2. 테스트케이스의 크기만큼의 배열을 만든다.
        // 3. for문을 돌려서 배열을 채운다.
        // 4. 3중 for문 안에 if문을 써서 최대값을 찾는다.
        // 5. 출력한다.

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int answer = 0;
        int [] arr = new int[M];

        for (int i = 0; i < M; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            for (int j = i+1; j < M; j++) {
                for (int k = j+1; k < M; k++) {
                    if (arr[i] + arr[j] + arr[k] <= N){
                        answer = Math.max(answer, arr[i] + arr[j] + arr[k]);
                    }
                }
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
