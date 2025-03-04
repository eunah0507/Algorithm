import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); 
        int m = Integer.parseInt(st.nextToken()); 

        long now = 0;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            now += Integer.parseInt(st.nextToken());
        }

        int num;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            num = Integer.parseInt(st.nextToken());
            if (num != 0) { 
                now *= num;
            }
        }

        sb.append(now);
        System.out.println(sb.toString());
    }
}
