import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        // 브실이는 일을 8시간 한 뒤에는 잠을 일정 시간 자야 한다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        long home = Long.parseLong(st.nextToken());
        long library = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int move = Integer.parseInt(st.nextToken());
        int sleep = Integer.parseInt(st.nextToken());

        long homeTotalTime = 0;
        long libraryTotalTime = 0;
        String answer = "";

        if (home % 8 == 0) {
            homeTotalTime = ((home / 8) - 1) * sleep + home;
        } else {
            homeTotalTime = (home / 8) * sleep + home;
        }

        if (library % 8 == 0) {
            libraryTotalTime = move + ((library / 8) - 1) * (move + sleep + move) + library;
        } else {
            libraryTotalTime = move + (library / 8) * (move + sleep + move) + library;
        }

        if (libraryTotalTime > homeTotalTime) {
            answer = "Zip";
            sb.append(answer).append("\n").append(homeTotalTime);
        } else {
            answer = "Dok";
            sb.append(answer).append("\n").append(libraryTotalTime);
        }

        System.out.println(sb.toString());

    }
}