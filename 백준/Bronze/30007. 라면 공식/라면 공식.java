import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();

            sb.append(A * (X - 1) + B);
            sb.append("\n");

        }
        System.out.println(sb.toString());
    }
}
