import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String curStr = br.readLine();
        String lecStr = br.readLine();
        String[] arr = br.readLine().split(" ");

        int t = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        int cur = Integer.parseInt(curStr.substring(0, 2)) * 3600
                + Integer.parseInt(curStr.substring(3, 5)) * 60
                + Integer.parseInt(curStr.substring(6, 8));

        int lec = Integer.parseInt(lecStr.substring(0, 2)) * 3600
                + Integer.parseInt(lecStr.substring(3, 5)) * 60
                + Integer.parseInt(lecStr.substring(6, 8));

        int runTime = t * (100 - k) / 100;

        int result = (lec >= cur && (lec - cur) >= runTime) ? 1 : 0;

        sb.append(result);
        System.out.print(sb.toString());
    }
}
