import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = 0;
        int b = 0;

        for (int i = 1; i <= 9; i++) {
            sb.setLength(0);
            sb.append("? A ").append(i);
            System.out.println(sb.toString());
            System.out.flush();
            int res = Integer.parseInt(br.readLine());
            if (res == 1) {
                a = i;
                break;
            }
        }

        for (int i = 1; i <= 9; i++) {
            sb.setLength(0);
            sb.append("? B ").append(i);
            System.out.println(sb.toString());
            System.out.flush();
            int res = Integer.parseInt(br.readLine());
            if (res == 1) {
                b = i;
                break;
            }
        }

        sb.setLength(0);
        sb.append("! ").append(a + b);
        System.out.println(sb.toString());
        System.out.flush();
    }
}