import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        
        int count = 0;
        int numA = 0;
        int numB = 0;

        for(int i = 1; i < 501; i++) {
            numB = i;

            numA = (int) Math.sqrt((numB * numB) + num);

            if((numA * numA) - num == numB * numB) {
                count++;
            }
        }

        sb.append(count).append("\n");
        System.out.println(sb.toString());

    }
}
