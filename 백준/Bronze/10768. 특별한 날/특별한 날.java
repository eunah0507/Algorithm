import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());
        String answer = "";

        if (month < 2) {
            answer = "Before";
        } else if (month == 2) {
            if (day < 18) {
                answer = "Before";
            } else if (day > 18) {
                answer = "After";
            } else {
                answer = "Special";
            }
        } else {
            answer = "After";
        }

        sb.append(answer);
        System.out.println(sb.toString());


    }
}