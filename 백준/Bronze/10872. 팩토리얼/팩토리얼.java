import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        // N! 구하는 문제

        Scanner sc = new Scanner(System.in);

        long num = sc.nextInt();
        long answer = 1;

        for (long i = num; i >= 1; i--) {
            answer *= i;
        }

        System.out.println(answer);
    }
}