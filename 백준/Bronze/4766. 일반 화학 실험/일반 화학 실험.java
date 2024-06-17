import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. 측정한 혼합몰의 온도가 순서대로 주어진다.
        // 2. 마지막 측정 후에느 999가 주어진다.
        // 3. 이전 온도와의 차이를 출력하라.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        double before = Double.parseDouble(br.readLine());
        double answer = 0;

        while (true){
            double temp = Double.parseDouble(br.readLine());

            if (temp == 999){
                break;
            }else{
                answer = temp - before;
                before = temp;
                sb.append(String.format("%.2f", answer)).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
