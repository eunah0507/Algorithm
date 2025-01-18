import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        String answer = "X";

        int hour = Integer.parseInt(st.nextToken());
        int minutes = Integer.parseInt(st.nextToken());

        if (hour % 30 == 0 && minutes == 0){
            answer = "O";
        }

        if ((hour - (minutes / 12)) % 30 == 0 && minutes % 12 == 0){
            answer = "O";
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}