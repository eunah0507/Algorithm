import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            char first = str.charAt(i);

            if (first == 'F'){
                answer = "Foundation";
            }else if (first == 'C'){
                answer = "Claves";
            }else if (first == 'V'){
                answer = "Veritas";
            }else if (first == 'E'){
                answer = "Exploration";
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
