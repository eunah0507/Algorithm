import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        
        int yt = Integer.parseInt(input[0]); 
        int yj = Integer.parseInt(input[1]); 

        while (true) {
            yj += yt;
            if (yj >= 5) {
                sb.append("yt");
                break;
            }

            yt += yj;
            if (yt >= 5) {
                sb.append("yj");
                break;
            }
        }

        System.out.println(sb.toString());
    }
}
