import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 치킨 기프티콘 N개와 유효기간이 주어진다.
        // 유효기간이 90일 이하로 남은 개수를 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int chicken = Integer.parseInt(br.readLine());
        int answer = 0;

        // for문을 돌려 각 기프티콘의 유효일수를 받아온다.
        for (int i = 0; i < chicken; i++) {
            String str = br.readLine();
            // substring을 사용해 D-를 제거한다
            str = str.substring(2);
            // 그 후, String인 str을 int로 변환한다.
            int day = Integer.parseInt(str);

            // if문을 사용해 사용할 갯수를 출력한다.
            if (day <= 90){
                answer++;
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}