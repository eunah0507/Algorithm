import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        double bestGa = 0;
        String snack = "";

        for (int i = 1; i <= 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double price = Double.parseDouble(st.nextToken());
            double weight = Double.parseDouble(st.nextToken());

            double ga = 0;

            if (price * 10 >= 5000) {
                ga = (weight * 10) / (price * 10 - 500);
            }
            else {
                ga = (weight * 10) / (price * 10 );
            }

            if (bestGa < ga) {
                bestGa = ga;
                if (i == 1) {
                    snack = "S";
                }
                else if (i == 2){
                    snack = "N";
                }
                else if (i == 3){
                    snack = "U";
                }
            }
        }

        sb.append(snack);
        System.out.println(sb.toString());
    }
}
