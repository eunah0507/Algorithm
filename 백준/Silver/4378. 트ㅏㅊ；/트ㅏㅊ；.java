import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String keyboard = "`1234567890-="
                        + "QWERTYUIOP[]\\"
                        + "ASDFGHJKL;\'"
                        + "ZXCVBNM,./";

        String line;
        while ((line = br.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (ch == ' ') {
                    sb.append(' ');
                } else {
                    int idx = keyboard.indexOf(ch);
                    if (idx > 0) {
                        sb.append(keyboard.charAt(idx - 1));
                    } else {
                        sb.append(ch); 
                    }
                }
            }
            sb.append('\n');
        }

        System.out.print(sb.toString());
    }
}
