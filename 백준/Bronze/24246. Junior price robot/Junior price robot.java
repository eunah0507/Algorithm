import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine().trim()); 
        int[] price = new int[num];
        int index = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (true) {
            while (st.hasMoreTokens()) {
                price[index++] = Integer.parseInt(st.nextToken());
                if (index == num) break;
            }
            if (index == num) break;
            st = new StringTokenizer(br.readLine());
        }

        int todayPrice = price[0];
        int answer = -1;

        for (int i = 1; i < num; i++) {
            if (price[i] <= todayPrice) {
                answer = i; // i일 전
                break;
            }
        }

        if (answer == -1) {
            sb.append("infinity");
        } else {
            sb.append(answer); 
        }

        System.out.print(sb.toString());
    }
}
