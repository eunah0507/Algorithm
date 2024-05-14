import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 첫 째줄에 관찰일수 N과 스트레스양 M이 주어진다.
        // 둘 째줄에 스트레스양 A가 주어진다.
        // A가 0보다 크면 그만큼 스트레스가 쌓인다.
        // A가 0보다 작으면 그만큼 스트레스가 해소된다.
        // 단, 누적된 스트레스 양보다 해소하는 스트레스가 크면 0
        // M보다 스트레스를 더 많이 받은 날을 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int day = Integer.parseInt(st.nextToken());
        int stress = Integer.parseInt(st.nextToken());
        int count = 0;
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < day; i++) {
            int dayStress = Integer.parseInt(st.nextToken());
            sum += dayStress;

            // 스트레스가 음수일 수 없으므로 조건을 건다
            if (sum < 0){
                sum = 0;
            }

            if (sum >= stress){
                count++;
            }
        }

        sb.append(count);
        System.out.println(sb.toString());
    }
}