import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < (5 * num); j++) {
                sb.append('@');
            }
            sb.append('\n');
        }
        for (int i = 0; i < (3 * num); i++) {
            for (int j = 0; j < num; j++) {
                sb.append('@');
            }
            sb.append('\n');
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < (5 * num); j++) {
                sb.append('@');
            }
            sb.append('\n');
        }
        System.out.println(sb.toString());
    }
}
