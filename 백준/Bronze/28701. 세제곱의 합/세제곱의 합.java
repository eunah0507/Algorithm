import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        int answerA = 0;
        int answerB = 0;
        int answerC = 0;

        for (int i = 1; i <= num; i++) {
            answerA += i;
            answerB = (int)Math.pow(answerA, 2);
            answerC += Math.pow(i, 3);
        }

        sb.append(answerA);
        sb.append("\n");
        sb.append(answerB);
        sb.append("\n");
        sb.append(answerC);

        System.out.println(sb.toString());
    }
}
