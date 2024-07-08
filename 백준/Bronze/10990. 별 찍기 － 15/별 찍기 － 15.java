import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N  = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N-i; j++) {
                sb.append(" ");
            }
            sb.append("*");
            for (int j = 0; j < i*2-1; j++) {
                sb.append(" ");
                if(i*2-2 == j){
                    sb.append("*");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());


    }
}
