import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        if (str.length() > 0) {
            sb.append(str.charAt(0));
            for (int i = 1; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch != str.charAt(i - 1)) {
                    sb.append(ch);
                }
            }
        }

        System.out.println(sb.toString());
    }
}
