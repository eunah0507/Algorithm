import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        if (num % 8 == 0) {
            sb.append(2);
        } else if (num % 4 == 3) {
            sb.append(3);
        } else if (num % 8 == 6) {
            sb.append(4);
        } else {
            sb.append(num % 8);
        }

        System.out.println(sb.toString());


    }
}