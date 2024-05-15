import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 학기 수 > 학기에 대한 정보 >

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int semester = Integer.parseInt(br.readLine());
            int totalSemester = 0;
            double totalGrade = 0;
            double gradeSum = 0;
            String total = "";

            for (int j = 0; j < semester; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int credit = Integer.parseInt(st.nextToken());
                double grade = Double.parseDouble(st.nextToken());

                // 총 학점은 다 더한다
                totalSemester += credit;
                // 평점 =  학점 * 점수 / 총학점 이므로 두 줄에 걸쳐 계산한다.
                gradeSum += grade * credit;
                totalGrade = gradeSum / totalSemester;
                // 계산한 뒤, String으로 변환해 소수점 첫 자리까지 출력한다.
                total = String.format("%.1f", totalGrade);
            }

            sb.append(totalSemester).append(" ").append(total).append("\n");
        }

        System.out.println(sb.toString());
    }
}
