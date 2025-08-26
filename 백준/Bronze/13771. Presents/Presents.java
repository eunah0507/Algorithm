import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        Arrays.sort(arr);

        sb.append(String.format("%.2f", arr[1]));
        System.out.println(sb.toString());
    }
}
