import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        List<Double>score = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            double sum = 0;

            for (int j = 0; j < str.length(); j++) {
                int k = (int)(str.charAt(j) - '0');
                if (k == 0 || k == 6){
                    k = 9;
                }

                sum = (sum * 10) + k;
            }

            score.add(sum);
        }

        double scoreSum = 0;
        for (int i = 0; i < score.size(); i++) {
            if (score.get(i) >= 100){
                score.set(i, 100d);
            }

            scoreSum += score.get(i);
        }

        double result = scoreSum / score.size();
        int answer = (int)(scoreSum / score.size());

        if ((double)(result - answer) < 0.5) {
            sb.append(answer).append("\n");
        }else{
            sb.append(answer + 1).append("\n");
        }

        System.out.println(sb.toString());
    }
}