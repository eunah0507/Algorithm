import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            double h = height / 100.0;
            double bmi = weight / (h * h);

            int grade;
            if (height < 140.1) {
                grade = 6;
            } else if (height < 146) {
                grade = 5;
            } else if (height < 159) {
                grade = 4;
            } else if (height < 161) {
                if (bmi >= 16.0 && bmi < 35.0) {
                    grade = 3;
                } else {
                    grade = 4;
                }
            } else if (height < 204) {
                if (bmi >= 20.0 && bmi < 25.0) {
                    grade = 1;
                } else if ((bmi >= 18.5 && bmi < 20.0) || (bmi >= 25.0 && bmi < 30.0)) {
                    grade = 2;
                } else if ((bmi >= 16.0 && bmi < 18.5) || (bmi >= 30.0 && bmi < 35.0)) {
                    grade = 3;
                } else {
                    grade = 4;
                }
            } else {
                grade = 4;
            }

            sb.append(grade).append("\n");
        }

        System.out.print(sb.toString());
    }
}
