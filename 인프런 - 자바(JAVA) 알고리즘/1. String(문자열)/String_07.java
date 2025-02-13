package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String answer = "";
        int length = str.length();

        str = str.toUpperCase();

        for (int i = 0; i < (length/2); i++) {
            if (str.charAt(i)!=str.charAt(length-i-1)) {
                answer = "NO";
                break;
            }else {
                answer = "YES";
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
