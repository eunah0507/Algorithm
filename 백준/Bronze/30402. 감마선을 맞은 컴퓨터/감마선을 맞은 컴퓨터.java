import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 15줄에 걸쳐 15자씩 알파벳이 나온다.
        // w가 나오면 춘배
        // b가 나오면 나비
        // g가 나오면 영철이다

        // 한 줄씩 for문을 통해 입력 받는다
        // 그 후, CharAt(i)로 한 글자씩 뽑아온다.
        // c가 w,b,g중 하나와 일치할 경우 break 하고 답을 출력한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String answer = "";

        for (int i = 0; i < 15; i++) {
            String str = br.readLine();

            for (int j = 0; j < 29; j++) {
                char word = str.charAt(j);

                if (word == 'w'){
                    answer = "chunbae";
                    break;
                }else if(word == 'b'){
                    answer = "nabi";
                    break;
                }else if(word == 'g'){
                    answer = "yeongcheol";
                    break;
                }
            }

            if (!answer.isBlank()){
                break;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());

    }
}