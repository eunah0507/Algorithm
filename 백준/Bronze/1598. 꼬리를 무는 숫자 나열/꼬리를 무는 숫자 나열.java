import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = scanner.nextInt() - 1;
        int numB = scanner.nextInt() - 1;

        int answer = 0;

        answer += Math.abs(numA / 4 - numB / 4);
        answer += Math.abs(numA % 4 - numB % 4);

        System.out.println(answer);
    }
}