import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 최소공배수(the least common multiple)
            int lcm = 0;
            // 최대공약수(the greatest common factor)
            int gcf = 1;
            int min = Integer.MAX_VALUE;

            int numA = Integer.parseInt(st.nextToken());
            int numB = Integer.parseInt(st.nextToken());

            min = Math.min(numA, numB);
            for (int j = min; j >= 1; j--) {
                if (numA % j == 0 && numB % j == 0){
                    gcf *= j;
                    numA /= j;
                    numB /= j;
                }
            }

            lcm = gcf * numA * numB;

            sb.append(lcm).append(" ").append(gcf).append("\n");
        }

        System.out.println(sb.toString());
    }
}