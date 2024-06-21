import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            double totalCost = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());

            int blaster = Integer.parseInt(st.nextToken());
            int visionSensor = Integer.parseInt(st.nextToken());
            int hearingSensor = Integer.parseInt(st.nextToken());
            int arm = Integer.parseInt(st.nextToken());
            int leg = Integer.parseInt(st.nextToken());

            totalCost = (blaster * 350.34) + (visionSensor * 230.90) + (hearingSensor * 190.55) + (arm * 125.30) + (leg * 180.90);
            sb.append("$").append(String.format("%.2f", totalCost)).append("\n");
        }

        System.out.println(sb.toString());
    }
}
