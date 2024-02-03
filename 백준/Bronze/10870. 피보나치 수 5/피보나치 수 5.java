import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 피보나치.. 구하기

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        int [] arr = new int [num+2];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= num; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        sb.append(arr[num]);

        System.out.println(sb.toString());
    }
}