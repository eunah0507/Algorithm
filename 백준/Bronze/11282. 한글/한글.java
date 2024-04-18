import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 초성 19개, 중성 21개, 종성 28개로 이뤄진 한글을 조합하라
        // 뭔 이딴... 미친문제를..

        // 1번째 글자는 가, 2번째는 각, 3번째는 갂이다.
        // 그러나 ㄱ + ㅏ 를 가로 출력할 수 없다.
        // 그러므로 아스키코드를 활용한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        // 강제 형변환을 한다.
        // '가'의 아스키코드는 44032이다. 숫자 1이 증가할 때 마다 문제의 조건이 충족된다.
        // 그러므로 테스트케이스 + 44031을 해서 출력한다.
        char answer = (char)(num+44031);
        sb.append(answer);

        System.out.println(sb.toString());


    }
}