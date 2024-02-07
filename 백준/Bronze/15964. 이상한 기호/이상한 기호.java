import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // A @ B = (A+B) * (A-B) 구하기
        // 단, A와 B는 1000 이하여야 한다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        long A = sc.nextLong();
        long B = sc.nextLong();

        
        sb.append((A + B) * (A - B));

        sc.close();

        System.out.println(sb.toString());

    }
}