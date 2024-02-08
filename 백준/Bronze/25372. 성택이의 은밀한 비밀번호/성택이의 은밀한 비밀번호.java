import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        // 문자열의 길이가 6 이상 9 이하면 yes 아니면 no

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        String answer = "";

        for (int i = 0; i < num; i++) {
            String str = sc.next();

            if (str.length() >= 6 && str.length() <= 9) {
                answer = "yes";
            } else {
                answer = "no";
            }
            sb.append(answer);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}