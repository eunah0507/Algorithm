import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 첫째줄에는 임스가 공부하기로 한 날 N이 주어짐
        // 둘째줄에는 임스가 공부하기로 계획한 페이지가 주어짐
        // 셋째줄에는 임스가 공부한 페이지가 주어짐
        // 임스가 계획한 페이지보다 더 많이 공부한 횟수 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int day = Integer.parseInt(br.readLine());

        int [] plan = new int [day];
        int [] study = new int [day];

        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < day; i++) {
            plan[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < day; i++) {
            study[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < day; i++) {
            if (study[i] - plan[i] >= 0){
                count++;
            }
        }

        sb.append(count);
        System.out.println(sb.toString());
    }
}