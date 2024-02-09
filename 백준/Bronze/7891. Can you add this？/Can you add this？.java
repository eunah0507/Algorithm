import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 입력받은 두 수를 더하기

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        long num = sc.nextInt();
        long answer = 0;

        for (int i = 0; i < num; i++) {
            long questionA = sc.nextInt();
            long questionB = sc.nextInt();

            answer = questionA + questionB;
            sb.append(answer);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
