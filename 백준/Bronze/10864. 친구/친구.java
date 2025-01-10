import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int student = Integer.parseInt(st.nextToken());
        int number = Integer.parseInt(st.nextToken());
        int [] arr = new int [student + 1];

        for (int i = 1; i <= number; i++) {
            st = new StringTokenizer(br.readLine());

            int numA = Integer.parseInt(st.nextToken());
            int numB = Integer.parseInt(st.nextToken());

            arr[numA]++;
            arr[numB]++;
        }

        for (int i = 1; i <= student; i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb.toString());

    }
}
