import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String A = sc.next();
        String B = sc.next();
        String C = sc.next();

        int answerA = Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C);
        String answerB = A + B;
        int answerC = Integer.parseInt(answerB) - Integer.parseInt(C);

        sb.append(answerA);
        sb.append("\n");
        sb.append(answerC);

        System.out.println(sb.toString());

    }
}
