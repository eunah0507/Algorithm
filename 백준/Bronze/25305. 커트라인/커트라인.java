import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 커트라인 구하는 문제

        // 1. 테스트케이스 int를 2개 받는다.
        // 2. 그 int로 배열을 만든다.
        // 3. for문을 돌려 배열을 채운다.
        // 4. 배열을 정렬한다. 이 때, 내림차순으로 정렬한다.
        // 5. k번째 수 (배열은 0부터 시작이니까 k-1)를 출력한다.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();
        Integer [] arr = new Integer[N];
        int answer = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        answer = arr[k-1];

        System.out.println(answer);

        sc.close();
    }
}