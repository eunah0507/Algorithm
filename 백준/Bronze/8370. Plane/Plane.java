import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 입력받은 네 수를 A*B + C*D 하기

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        int answer = (A * B) + (C * D);
        
        sb.append(answer);
        System.out.println(sb.toString());
        
    }
}
