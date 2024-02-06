import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 카드 게임으로 얻은 총 점 구하기

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = 5;
        int answer = 0;

        for (int i = 1; i <= 5; i++) {
            int JOI = sc.nextInt();
            answer += JOI;
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}