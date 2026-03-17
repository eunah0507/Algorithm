import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int ad = Integer.parseInt(st.nextToken());
        int ed = Integer.parseInt(st.nextToken());

        double aTimeSum = 0.0;
        double eTimeSum = 0.0;
        double aSpeedSum = 0.0;
        double eSpeedSum = 0.0;
        int aCnt = 0;
        int eCnt = 0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            char c = Character.toUpperCase(st.nextToken().charAt(0));
            double t = Double.parseDouble(st.nextToken());

            if (c == 'A') {
                aTimeSum += t;
                aSpeedSum += (double) ad / t;
                aCnt++;
            } else {
                eTimeSum += t;
                eSpeedSum += (double) ed / t;
                eCnt++;
            }
        }

        double a1 = (double) ad * aCnt / aTimeSum;
        double e1 = (double) ed * eCnt / eTimeSum;
        double a2 = aSpeedSum / aCnt;
        double e2 = eSpeedSum / eCnt;

        sb.append("Method 1\n");
        sb.append(String.format(java.util.Locale.US, "African: %.2f furlongs per hour%n", a1));
        sb.append(String.format(java.util.Locale.US, "European: %.2f furlongs per hour%n", e1));
        sb.append("Method 2\n");
        sb.append(String.format(java.util.Locale.US, "African: %.2f furlongs per hour%n", a2));
        sb.append(String.format(java.util.Locale.US, "European: %.2f furlongs per hour%n", e2));

        System.out.print(sb.toString());
    }
}