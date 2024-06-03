import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());

        int answer = 0;
        
        for (int i = 1; i < num + 1; i++) {
            for (int j = 1; j < num + 1; j++) {
                for (int k = 1; k < num + 1; k++) {
                    if (i + j + k == num && i >= j + 2 && k % 2 == 0) {
                        answer++;
                    }
                }
            }
        }
        sb.append(answer);
        System.out.println(sb.toString());
    }
}
