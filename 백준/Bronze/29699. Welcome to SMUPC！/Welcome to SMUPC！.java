import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt() - 1;
        String str = "WelcomeToSMUPC";
        char answer = str.charAt(num % 14);

        sb.append(answer);
        System.out.println(sb.toString());

    }
}
