import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int second1 = Integer.parseInt(br.readLine());
        int second2 = Integer.parseInt(br.readLine());
        int second3 = Integer.parseInt(br.readLine());
        int second4 = Integer.parseInt(br.readLine());

        int minutes = (second1 + second2 + second3 + second4) / 60;
        int second = (second1 + second2 + second3 + second4) % 60;

        sb.append(minutes).append("\n").append(second);
        System.out.println(sb.toString());
    }
}