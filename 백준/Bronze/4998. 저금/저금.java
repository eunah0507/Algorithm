import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            StringTokenizer st = new StringTokenizer(line);
            double money = Double.parseDouble(st.nextToken()); 
            double rate = Double.parseDouble(st.nextToken());
            double goal = Double.parseDouble(st.nextToken());  

            int year = 0;
            while (money <= goal) {
                money += money * (rate / 100.0);
                year++;
            }

            sb.append(year).append("\n");
        }

        System.out.print(sb.toString());
    }
}
