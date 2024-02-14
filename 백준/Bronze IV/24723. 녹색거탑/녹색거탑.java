import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // 2의 n제곱만큼의 방법이 있다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        int answer = (int)Math.pow(2,num);

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
