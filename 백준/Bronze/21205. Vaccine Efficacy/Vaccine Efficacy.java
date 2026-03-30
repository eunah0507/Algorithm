import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int vacCnt = 0;
        int conCnt = 0;
        int[] vac = new int[3];
        int[] con = new int[3];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            if (s.charAt(0) == 'Y') {
                vacCnt++;
                for (int j = 0; j < 3; j++) {
                    if (s.charAt(j + 1) == 'Y') {
                        vac[j]++;
                    }
                }
            } else {
                conCnt++;
                for (int j = 0; j < 3; j++) {
                    if (s.charAt(j + 1) == 'Y') {
                        con[j]++;
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            double vacRate = (double) vac[i] / vacCnt;
            double conRate = (double) con[i] / conCnt;

            if (vacRate >= conRate) {
                sb.append("Not Effective");
            } else {
                double efficacy = (conRate - vacRate) / conRate * 100.0;
                sb.append(String.format("%.6f", efficacy));
            }

            if (i < 2) {
                sb.append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}