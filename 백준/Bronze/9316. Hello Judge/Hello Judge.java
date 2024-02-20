import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            String str = "Hello World, Judge ";

            sb.append(str).append(i).append("!").append("\n");
        }

        System.out.println(sb.toString());
    }
}