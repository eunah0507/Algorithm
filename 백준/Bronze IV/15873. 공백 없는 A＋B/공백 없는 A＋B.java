import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        if (num % 10 == 0) {
            num /= 100;
            sb.append(10 + num);
        } else {
            int a = num % 10;
            num /= 10;
            if (num == 10) {
                sb.append(10 + a);
            } else {
                sb.append(a + num);
            }
        }
        
        System.out.println(sb.toString());
    }
}
