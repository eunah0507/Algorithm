import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        // 666이 연속으로 들어가는 수 구하기
        // 666부터 시작해서 5666 다음은 6660, 6661 이고
        // 15666 댜음은 16666이 아니고 16660이다.

        // 1. 테스트케이스 int를 받아온다.
        // 2. for문을 돌린다.
        // 3. Primary Queue를 사용한다.
        //

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        Integer [] arr = new Integer[5000000];

        for (int i = 0; i < arr.length; i++) {
            String tmp = "" + i;
            if (tmp.contains("666")) {
                arr[i] = i;
            } else{
                arr[i] = Integer.MAX_VALUE;
            }
        }

        Arrays.sort(arr);

        System.out.println(arr[num-1]);
    }

}