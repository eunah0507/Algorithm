import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 이모지의 전체 길이 + 콜론의 개수 + (언더바의 개수 * 5)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        int length = str.length();
        int colone = 0;
        int under = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ':'){
                colone++;
            }

            if (ch == '_'){
                under++;
            }
        }

        int answer = length + colone + (under * 5);

        sb.append(answer);
        System.out.println(sb.toString());
    }
}