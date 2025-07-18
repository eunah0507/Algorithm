import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());

        int startYear = 2024;
        int startMonth = 8;

        int totalMonths = (num - 1) * 7;
        int finalMonth = startMonth + totalMonths;

        int year = startYear + (finalMonth - 1) / 12;
        int month = (finalMonth - 1) % 12 + 1;

        sb.append(year).append(" ").append(month);
        System.out.println(sb.toString());
    }
}
