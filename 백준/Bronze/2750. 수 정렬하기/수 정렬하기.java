import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // N이 주어지면, 오름차순으로 정렬하는 문제

        // 1. 테스트케이스 int 를 받아온다.
        // 2. 배열을 int만큼 만든다
        // 3. for문을 돌려 배열을 채운다
        // 4. Arrays.sort()로 오름차순 정렬한다.
        // 5. for문을 이용해 출력한다.

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int [] arr = new int [num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
    }
}