import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 문제

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}