import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine());
        int count = 0;

        while (n > 0) {
            long rev = 0;
            long temp = n;

            while (temp > 0) {
                rev = (rev << 1) | (temp & 1);
                temp >>= 1;
            }

            n = rev - 1;
            count++;
        }

        sb.append(count);
        System.out.print(sb.toString());
    }
}