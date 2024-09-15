import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        int[] numA = new int[num];
        int[] numB = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            numA[i] = Integer.parseInt(st.nextToken());
            numB[i] = numA[i];
        }

        Arrays.sort(numB);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(numA[i] == numB[j]) {
                    sb.append(j).append(" ");
                    numB[j] = -1;
                    
                    break;
                }
            }
        }

        System.out.println(sb.toString());
    }
}
