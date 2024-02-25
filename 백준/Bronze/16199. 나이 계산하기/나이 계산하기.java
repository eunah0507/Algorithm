import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int birthYear = Integer.parseInt(st.nextToken());
        int birthMonth = Integer.parseInt(st.nextToken());
        int birthDay = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int nowYear = Integer.parseInt(st.nextToken());
        int nowMonth = Integer.parseInt(st.nextToken());
        int nowDay = Integer.parseInt(st.nextToken());

        int manAge = 0;
        int saeAge = nowYear - birthYear + 1;
        int yearAge = nowYear - birthYear;

        if (nowMonth > birthMonth) {
            manAge = nowYear - birthYear;
        } else if (nowMonth == birthMonth) {
            if (nowDay >= birthDay) {
                manAge = nowYear - birthYear;
            } else {
                manAge = nowYear - birthYear - 1;
            }
        }else{
            manAge = nowYear - birthYear - 1;
        }

        if (manAge < 0) {
            manAge = 0;
        }

        if (saeAge < 0) {
            saeAge = 0;
        }

        if (yearAge < 0) {
            yearAge = 0;
        }

        sb.append(manAge).append("\n");
        sb.append(saeAge).append("\n");
        sb.append(yearAge).append("\n");

        System.out.println(sb.toString());

    }
}