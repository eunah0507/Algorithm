import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 1을 N / N 으로 나타냈을 때,
        // 제리가 훔쳐가고 남은 치즈 양 구하기

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int numA = sc.nextInt();
        int numB = sc.nextInt();

        sb.append(numB - numA);
        sb.append(" "+ numB);

        System.out.println(sb.toString());


    }
}
