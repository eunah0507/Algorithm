import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int count = 0;

        while (count < num) {
            String line;
            while ((line = br.readLine()) != null && line.trim().isEmpty()) {}

            String[] tokens = line.trim().split(" ");
            long a = Long.parseLong(tokens[0]);
            long b = Long.parseLong(tokens[1]);
            long c = Long.parseLong(tokens[2]);
            long d = Long.parseLong(tokens[3]);

            long[] arr = {a, b, c};
            Arrays.sort(arr);
            a = arr[0];
            b = arr[1];
            c = arr[2];

            long s = a + b + c - d;
            long tmp = Math.min(s / 3, a);
            long a1 = tmp;
            s -= tmp;
            tmp = Math.min(s / 2, b);
            long answer = a1 * tmp * (s - tmp);

            sb.append(answer).append("\n");
            count++;
        }

        System.out.print(sb.toString());
    }
}
