import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 분수 A, B를 구하고 두 분수의 합을 구한 후 기약분수 만들기

        // A,B의 분자, 분모를 담을 변수 4개 + 합을 구할 변수 2개 만든다.
        // for문을 돌려 Math.max(A, B)부터 1까지 i--한다.
        // if문을 돌려 기약분수인지 찾고 나눠준다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = b * d;
        int f = (a * d) + (b * c);

        for (int i = Math.max(e, f); i >= 1 ; i--) {
            if (e % i == 0 && f % i == 0){
                e /= i;
                f /= i;
            }
        }

        sb.append(f + " ");
        sb.append(e);

        System.out.println(sb.toString());

    }
}