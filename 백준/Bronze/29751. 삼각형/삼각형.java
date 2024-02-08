import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        // 삼각형 넓이 구하기 문제
        // 삼각형 넓이 : (밑변 * 높이) / 2

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        double numA = sc.nextDouble();
        double numB = sc.nextDouble();
        double answer = (numA * numB) / 2;

        sb.append(answer);
        System.out.println(sb.toString());
    }
}