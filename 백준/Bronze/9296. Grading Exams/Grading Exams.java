import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            int l = Integer.parseInt(br.readLine());
            String key = br.readLine();
            String ans = br.readLine();

            int cnt = 0;
            for (int j = 0; j < l; j++) {
                if (key.charAt(j) != ans.charAt(j)) {
                    cnt++;
                }
            }

            sb.append("Case ").append(i).append(": ").append(cnt).append("\n");
        }

        System.out.print(sb.toString());
    }
}