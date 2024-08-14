import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++) {
            
            double money = Double.parseDouble(br.readLine());
            
            money *= 0.8;

            sb.append("$").append(String.format("%.2f", money)).append("\n");
        }
        System.out.println(sb.toString());
    }
}
