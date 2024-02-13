import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

       int N = sc.nextInt();

        for (int i = N; i >= 1; i--) {
            sb.append(i);
            sb.append("\n");
        }

        System.out.println(sb.toString());

    }
}
