import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 문자열의 길이를 입력받는다.
        int num = Integer.parseInt(br.readLine());
        // 문자열을 입력받는다.
        String str = br.readLine();

        // 알파벳은 총 26자이므로, 배열을 만든다.
        int [] abc = new int [26];

        // for문을 문자열의 길이만큼 돌린다.
        for (int i = 0; i < num; i++) {
            // charAt으로 한 글자씩 뽑는다.
            char ch = str.charAt(i);
            // 아스키코드를 활용한다. 소문자 a는 97이다.
            // chatAt으로 한글자를 뽑아와 빼버린다.
            int index = ch - 97;

            // chatAt으로 뽑은 글자가 알파벳이 아니라면 지나간다.
            if (index < 0 || index > 25){
                continue;
            }

            // 해당 위치에 맞는 알파벳을 count++한다.
            abc[index]++;
        }

        // 오름차순으로 정렬한다. 가장 높은 수를 알기 위해서다.
        Arrays.sort(abc);

        // 마지막으로 정렬된 수를 뽑아온다.
        sb.append(abc[25]);
        System.out.println(sb.toString());

    }
}
