import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 테스트케이스 N
        // N개의 줄에서 3개의 정수 r,e,c가 주어진다
        // r은 광고를 하지 않았을 때 수익, e는 광고했을 때 수익
        // c는 광고 비용이다. 광고를 할까 말까?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int noAd = Integer.parseInt(st.nextToken());
            int yesAd = Integer.parseInt(st.nextToken());
            int adCost = Integer.parseInt(st.nextToken());

            String answer = "";

            if ((yesAd - adCost) > noAd){
                answer = "advertise";
            }else if((yesAd - adCost) == noAd){
                answer = "does not matter";
            }else{
                answer = "do not advertise";
            }

            sb.append(answer).append("\n");
        }
        System.out.println(sb.toString());
    }
}