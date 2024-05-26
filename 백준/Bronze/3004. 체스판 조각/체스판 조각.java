import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for(int i = 1; i <= num; i++) {
            if(i == 1) {
                sum += 2;
            }else {
                sum += ((i / 2) + 1);
            }
        }
  
        sb.append(sum);
        System.out.println(sb.toString());

    }
}
