import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());

        Long a = Long.parseLong(br.readLine());
        Long b = Long.parseLong(br.readLine());

        Long answer = a * b;
        sb.append(answer);
        System.out.println(sb.toString());
    }
}
