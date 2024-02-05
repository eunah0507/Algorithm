import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // M 이상 N 이하의 모든 소수 출력하기

        // for문을 돌려서 안나눠지면 출력한다.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int M = sc.nextInt();
        int N = sc.nextInt();

        int [] arr = new int [N+1];

        for (int i = 2; i <= N; i++) {
            if (arr[i] == 0){
                if (i >= M) {
                    sb.append(i);
                    sb.append("\n");
                }
                for (int j = i; j <= N; j=j+i) {
                    arr[j] = 1;
                }
            }
        }

        System.out.println(sb.toString());
    }
}