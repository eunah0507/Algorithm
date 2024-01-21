import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 평균값과 중앙값을 찾아내는 문제
        
        // 1. int num = 5를 만든다
        // 2. num을 이용해 배열을 만든다.
        // 3. for문을 돌려 테스트케이스 값을 받아온다.
        // 4. 다시 for문을 돌려 평균값을 구한다.
        // 5. 배열을 정렬한 후, 3번째 값(중앙값)을 출력한다
        
        Scanner sc = new Scanner(System.in);
        
        int num = 5;
        int [] arr = new int [5];
        // 평균값
        int average = 0;
        // 중앙값
        int center = 0;

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            average += arr[i];
        }

        average = average / 5;

        Arrays.sort(arr);

        center = arr[2];

        System.out.println(average);
        System.out.println(center);



    }
}