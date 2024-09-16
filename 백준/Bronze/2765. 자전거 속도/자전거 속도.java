import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = 1;

        while(true) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            double numA = Double.parseDouble(st.nextToken());
            double numB = Double.parseDouble(st.nextToken());
            double numC = Double.parseDouble(st.nextToken());

            if(numB == 0) {
                break;
            }

            numC = (numC / 60) / 60;
            double distance = ((((numA * 3.1415927) * numB) / 12) / 5280);
            double answer = (distance / numC);

            sb.append("Trip #").append(num).append(": ");
            sb.append(String.format("%.2f", distance)).append(" ");
            sb.append(String.format("%.2f", answer));
            sb.append("\n");

            num++;
        }

        System.out.println(sb.toString());
    }
}
