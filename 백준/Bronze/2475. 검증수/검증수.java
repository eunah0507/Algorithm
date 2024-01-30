import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 검증수 출력하는 문제

        // 5개를 받는다고 했으니까 바로 for문 돌려서 값을 받아온다.
        // for문 안에 while문을 돌려서 답을 출력한다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num;
        int sum = 0;;
        int answer = 0;

        for (int i = 0; i < 5; i++) {
            num = sc.nextInt();
            sum += Math.pow(num, 2);
        }

        answer = (sum % 10);

        sb.append(answer);

        System.out.println(sb.toString());
    }
}