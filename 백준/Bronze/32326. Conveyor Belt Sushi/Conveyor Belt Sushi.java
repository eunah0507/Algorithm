import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int r = Integer.parseInt(br.readLine());
        int g = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int c = r * 3 + g * 4 + b * 5;

        sb.append(c);
        System.out.println(sb.toString());
    }
}
