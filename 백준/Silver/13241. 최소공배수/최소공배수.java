import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // A,B의 최소공배수를 구하는 문제

        // A와 B를 받아온다.
        // A,B 중 더 큰 수로 for문을 돌린다.
        // 공통으로 나뉘어지면 answer에 곱해서 중첩해주고 A,B를 각각 나눠준다.
        // 마지막에 다 곱해준다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        long A = sc.nextLong();
        long B = sc.nextLong();

        long answer = 1;
        long MathMaxAB = Math.max(A,B);

        for (long i = MathMaxAB; i >= 1; i--) {
            if (A % i == 0 && B % i == 0){
                answer *= i;
                A /= i;
                B /= i;
            }
        }

        answer *= A * B;

        sb.append(answer);
        System.out.println(sb.toString());

    }
}