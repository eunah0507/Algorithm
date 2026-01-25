import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int q = Integer.parseInt(br.readLine().trim());

        int firstDomesticDeparture = 6 * 60 + 6;      
        int interval = 12;                            
        int lastDomesticDeparture = 24 * 60 + 6;      

        for (int i = 0; i < q; i++) {
            int m = Integer.parseInt(br.readLine().trim());

            int k = (m / 50) + 1; 
            int depart = firstDomesticDeparture + (k - 1) * interval;

            if (depart > lastDomesticDeparture) {
                sb.append("-1");
            } else {
                int t = depart % (24 * 60);
                int hh = t / 60;
                int mm = t % 60;

                if (hh < 10) {
                    sb.append('0');
                }
                sb.append(hh).append(':');
                if (mm < 10) {
                    sb.append('0');
                }
                sb.append(mm);
            }

            if (i + 1 < q) {
                sb.append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}
