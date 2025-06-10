import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // num 입력 
        int num = Integer.parseInt(br.readLine());
        int answer = -1;
        
        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().split(" ");
            int sum = Integer.parseInt(input[0]) + Integer.parseInt(input[1]) + Integer.parseInt(input[2]);
            
            if (sum >= 512) {
                if (answer == -1 || sum < answer) {
                    answer = sum;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        
        System.out.println(sb.toString());
    }
}
