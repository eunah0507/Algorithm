import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(br.readLine());

        if (n >= -32768 && n <= 32767) {
            sb.append("short");
        } else if (n >= -2147483648L && n <= 2147483647L) {
            sb.append("int");
        } else {
            sb.append("long long");
        }

        System.out.println(sb.toString());
    }
}
