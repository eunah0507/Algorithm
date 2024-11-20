import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        String isTime = "";
        String isDate = "";

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int numA = Integer.parseInt(st.nextToken());
            int numB = Integer.parseInt(st.nextToken());

            // isTime에 관련된 조건문 먼저 작성한다.
            // numA는 23이하, numB는 59 이하여야 한다.
            if (numA > 23 || numB > 59) {
                isTime = "No";
            } else {
                isTime = "Yes";
            }

            // isDate에 관련된 조건문도 작성한다.
            // numA가 12이하, numB는 numA가 (1,3,5,7,8,9,10) / (4,6,9,11) / 2월일 때 다름
            // 다행히 윤년은 안따진다
            if (numA == 0) {
                isDate = "No";
            } else {
                if (((numA == 1) || (numA == 3) || (numA == 5) || (numA == 7) || (numA == 8) || (numA == 10) || (numA == 12)) && numB <= 31 && numB > 0) {
                    isDate = "Yes";
                } else if (((numA == 4) || (numA == 6) || (numA == 9) || (numA == 11)) && numB <= 30 && numB > 0) {
                    isDate = "Yes";
                } else if (numA == 2 && numB <= 29 && numB > 0) {
                    isDate = "Yes";
                } else {
                    isDate = "No";
                }
            }
            sb.append(isTime).append(" ").append(isDate).append("\n");
        }

        System.out.println(sb.toString());

    }
}
