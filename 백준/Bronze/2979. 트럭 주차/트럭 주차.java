import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[103];

        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());
        int numC = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            
            int tmpA = Integer.parseInt(st.nextToken());
            int tmpB = Integer.parseInt(st.nextToken());

            for (int j = tmpA; j < tmpB; j++) {
                arr[j]++;
            }
        }

        int totalPrice = 0;
        
        for (int i = 0; i < 100; i++) {
            if (arr[i] == 1) {
                totalPrice += numA;
            } else if (arr[i] == 2) {
                totalPrice += numB * 2;
            } else if (arr[i] == 3) {
                totalPrice += numC * 3;
            }
        }

        sb.append(totalPrice);

        System.out.println(sb.toString());
    }
}
