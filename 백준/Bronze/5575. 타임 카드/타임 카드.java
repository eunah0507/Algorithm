import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // 퇴근시간은 무조건 출근시간보다 늦다
        // 퇴근초가 출근 초보다 빠르면 퇴근 분을 -1 하고 퇴근 초를 +60한다.
        // 퇴근 분이 출근 분보다 빠르면 퇴근 시를 -1하고 퇴근 분을 +60한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int startHour = Integer.parseInt(st.nextToken());
            int startMinutes = Integer.parseInt(st.nextToken());
            int startSecond = Integer.parseInt(st.nextToken());

            int endHour = Integer.parseInt(st.nextToken());
            int endMinutes = Integer.parseInt(st.nextToken());
            int endSecond = Integer.parseInt(st.nextToken());

            if (endSecond < startSecond){
                endMinutes--;
                endSecond += 60;
            }

            if (endMinutes < startMinutes){
                endHour--;
                endMinutes += 60;
            }

            int workHour = endHour - startHour;
            int workMinutes = endMinutes - startMinutes;
            int workSecond = endSecond - startSecond;

            sb.append(workHour).append(" ").append(workMinutes).append(" ").append(workSecond).append("\n");
        }

        System.out.println(sb.toString());
    }
}