import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int [] score = new int [5];
        int avg = 0;

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            if (score[i] <= 40){
                score[i] = 40;
            }

            avg += score[i];
        }

        avg /= 5;

        sb.append(avg);
        System.out.println(sb.toString());
    }
}
