import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        // 맨 앞글자가 모음이 아닐때 까지 맨 앞 글자를 어미로 들린 후
        // 그 끝에 ay를 붙여서 완성한다.
        // frog > rogf > ogfr > ogfray
        // apple > appleay
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            String isMo = "";
            String isJa = "";
            String answer = "";

            if (str.equals("#")) {
                break;
            } else {
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);

                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        isMo = String.valueOf(ch) + str.substring(i + 1);
                        break;
                    } else {
                        isJa += String.valueOf(ch);
                    }
                }
            }

            answer = isMo + isJa + "ay";
            sb.append(answer).append("\n");
        }
        
        System.out.println(sb.toString());
    }
}
