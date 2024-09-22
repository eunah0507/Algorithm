import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String num = br.readLine();

        while(true) {
            boolean flag = true;
            
            for(int i = 0; i < num.length(); i++) {
                if(num.charAt(i) != '4' && num.charAt(i) != '7') {
                    flag = false;
                    
                    break;
                }
            }

            if(flag == true) {
                break;
            }
            else {
                num = String.valueOf(Integer.parseInt(num) - 1);
            }
        }
        
        sb.append(num);

        System.out.println(sb.toString());
    }
}
