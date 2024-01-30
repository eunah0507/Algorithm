import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 팩토리얼 문제

        // N!을 for문을 통해 구한다.
        // 단, if문을 사용해서 0을 입력받을 때에는 1을 출력하게 한다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        long num = sc.nextInt();
        long answer = 1;

        for (int i = 1; i <= num; i++) {
            if (num == 0){
                answer = 1;
            }else{
                answer *= i;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}