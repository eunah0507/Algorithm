import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[] score = {13, 7, 5, 3, 3, 2};

        String[] line1 = br.readLine().split(" ");
        String[] line2 = br.readLine().split(" ");

        double choScore = 0;
        double hanScore = 1.5; 

        for (int i = 0; i < 6; i++) {
            choScore += Integer.parseInt(line1[i]) * score[i];
            hanScore += Integer.parseInt(line2[i]) * score[i];
        }

        if (choScore > hanScore) {
            sb.append("cocjr0208");
        } else {
            sb.append("ekwoo");
        }

        System.out.println(sb.toString());
    }
}
