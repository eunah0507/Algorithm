import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'B') {
                answer += 2;
            } else if (ch == '@' ||
                       ch == 'A' || ch == 'D' || ch == 'O' || ch == 'P' || ch == 'Q' || ch == 'R' ||
                       ch == 'a' || ch == 'b' || ch == 'd' || ch == 'e' || ch == 'g' || ch == 'o' || ch == 'p' || ch == 'q') {
                answer += 1;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}