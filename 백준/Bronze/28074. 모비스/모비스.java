import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 취업준비가 힘들어 정신을 놔버린 진익이...
        // 주어진 문자열로 MOBIS를 만들 수 있는지 묻는 문제

        // 문자열을 입력받는다.
        // 한 글자씩 charAt(i)해서 분리한 뒤, MOBIS를 만들 수 있는지 본다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String answer = "";
        
        // 귀찮지만, 따로따로 변수를 만들어 맞는지 비교한다.
        Boolean M = false;
        Boolean O = false;
        Boolean B = false;
        Boolean I = false;
        Boolean S = false;
        
        // for문을 돌려 한 글자씩 뽑아내고, 있을 경우 각 Boolean 값을 true로 바꾼다.
        for (int i = 0; i < str.length(); i++) {
            char word = str.charAt(i);
            
            if (word == 'M') {
                M = true;
            } else if (word == 'O') {
                O = true;
            } else if (word == 'B') {
                B = true;
            } else if (word == 'I') {
                I = true;
            } else if (word == 'S') {
                S = true;
            }


        }

        // for문이 종료되 뒤, 모든 Boolean 값이 true이면 조건 충족이므로 YES
        if (M == true && O == true && B == true && I == true && S == true) {
            answer = "YES";
        } else {
            answer = "NO";
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}