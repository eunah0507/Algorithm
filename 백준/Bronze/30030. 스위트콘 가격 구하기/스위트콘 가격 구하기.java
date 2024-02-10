import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 11의 배수 B원이 주어졌을때
        // A원 구하기
        // A * 10% = B

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int B = sc.nextInt();
        int A = (int)(B / 1.1f);

        sb.append(A);
        System.out.println(sb.toString());

    }
}
