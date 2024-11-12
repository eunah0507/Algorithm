import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine());
        sb.append("AKARAKA");
        for (int i = 0; i < K-1; i++) {
            sb.append("RAKA");
        }

        System.out.println(sb.toString());
    }
}
