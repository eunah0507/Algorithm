import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int lineIndex = 1; 

        while (true) {
            String line = br.readLine();
            if (line.equals("Was it a cat I saw?")) break;

            int step = lineIndex + 1; 
            StringBuilder decoded = new StringBuilder();

            for (int i = 0; i < line.length(); i += step) {
                decoded.append(line.charAt(i));
            }

            sb.append(decoded).append("\n");
            lineIndex++;
        }

        System.out.print(sb.toString());
    }
}
