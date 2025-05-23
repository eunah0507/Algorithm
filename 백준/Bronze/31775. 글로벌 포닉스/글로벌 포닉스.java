import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 응원 문구는 문자열 세 개로 이루어져있다.
        // 세 문자열이 순서와 관계 없이 1, k, p로 시작할 경우 GLOBAL한 문구
        String answer = String.valueOf("");
        List<Character> ch = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String str = br.readLine();

            ch.add(str.charAt(0));
        }

        if (ch.contains('l') && ch.contains('k') && ch.contains('p')){
            answer = "GLOBAL";
        }else{
            answer = "PONIX";
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
