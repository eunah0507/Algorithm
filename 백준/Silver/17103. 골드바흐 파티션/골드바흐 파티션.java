import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 입력받은 N을 소수 + 소수로 구한다.
        // 이 때, 몇 가지 방법으로 나타낼 수 있나?

        // 배열을 100만+1 까지 받는다.
        // 에라토스테네스 체를 이용해서 미리 소수들을 뽑아놓는다.
        // 그 후, 값을 입력받는다.
        // for문을 값만큼 돌린다.
        // 다시 for문을 1/2만큼 돌린다.(같은 수가 위치 다르게 나오는거 방지)
        // if (prime[j] == 1 && prime[n - j] == 1)면 소수합으로 이루어지니까
        // count++한다

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[1000001];
        int[] prime = new int[1000001];
        int count = 0;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) {
                prime[i] = 1;
            }

            for (int j = i; j < arr.length; j += i) {
                arr[j] = 1;
            }
        }

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            count = 0;
            int n = sc.nextInt();

            for (int j = 1; j <= n/2; j++) {
                if (prime[j] == 1 && prime[n - j] == 1) {
                    count++;
                }
            }
            sb.append(count);
            sb.append("\n");
        }

        System.out.println(sb.toString());

    }
}