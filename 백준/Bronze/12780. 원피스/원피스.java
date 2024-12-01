import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String h = br.readLine();
        String n = br.readLine();

        int total = 0, index = 0;

        while ((index = h.indexOf(n, index)) != -1) {
            total++;
            index += n.length();
        }

        sb.append(total);
        System.out.println(sb.toString());
    }
}