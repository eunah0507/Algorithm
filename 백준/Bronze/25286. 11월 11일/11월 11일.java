import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int year = 0;
        int month = 0;
        int day = 0;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int numY = Integer.parseInt(st.nextToken());
            int numM = Integer.parseInt(st.nextToken());

            if (numM == 1) {
                year = numY - 1;
                month = 12;
            } else {
                year = numY;
                month = numM - 1;
            }

            if ((numM - 1 == 4) || (numM - 1 == 6) || (numM - 1 == 9) || (numM - 1 == 11)) {
                day = 30;
            } else if (numM - 1 == 2) {
                if (((numY % 100 != 0) && (numY % 4 == 0)) || (numY % 400 == 0)) {
                    month = 2;
                    day = 29;
                }else{
                    month = 2;
                    day = 28;
                }
            } else {
                day = 31;
            }

            sb.append(year).append(" ").append(month).append(" ").append(day).append("\n");
        }

        System.out.println(sb.toString());

    }
}
