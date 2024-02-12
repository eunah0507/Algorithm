import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 별찍기

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }
}
