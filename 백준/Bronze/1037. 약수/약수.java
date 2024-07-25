import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (num -- > 0) {
            int N = Integer.parseInt(st.nextToken());

            max = N > max ? N : max;
            min = N < min ? N : min;

        }

        sb.append(max * min).append("\n");
        System.out.println(sb.toString());
    }
}
