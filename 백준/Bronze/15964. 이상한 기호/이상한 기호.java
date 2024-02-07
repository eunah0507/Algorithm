import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // A @ B = (A+B) * (A-B) 구하기
        // 단, A와 B는 1000 이하여야 한다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int A = sc.nextInt();
        int B = sc.nextInt();
        int answer = 0;

        if (A <= 1000 && B <= 1000){
            answer = (A+B) * (A-B);
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }
}