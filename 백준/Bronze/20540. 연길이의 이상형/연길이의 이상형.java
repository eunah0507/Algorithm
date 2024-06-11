import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 꼴에 연길이는 자기랑 정 반대인 사람이 이상형이다.
        // 정반대 MBTI를 찾아주자

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String mbti = br.readLine();
        String answer = "";

        for (int i = 0; i < 4; i++) {
            char word = mbti.charAt(i);

            if (word == 'I'){
                answer += "E";
            }else if(word == 'E'){
                answer += "I";
            }else if(word == 'N'){
                answer += "S";
            }else if(word == 'S'){
                answer += "N";
            }else if(word == 'T'){
                answer += "F";
            }else if(word == 'F'){
                answer += "T";
            }else if(word == 'J'){
                answer += "P";
            }else{
                answer += "J";
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
