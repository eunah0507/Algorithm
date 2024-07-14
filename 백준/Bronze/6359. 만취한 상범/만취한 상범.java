import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        
        while(num-- > 0) {
            int N = Integer.parseInt(br.readLine());
            boolean[] arr = new boolean[N+1];
            
            for (int i = 1; i <= N; i++) {
                for (int j = i; j <= N; j+=i) {
                    arr[j] = !arr[j];
                }
            }
            
            int cnt = 0;
            
            for (int i = 1; i <= N; i++)
                if (arr[i]) {
                    cnt++;
                }
            sb.append(cnt).append("\n");
        }
        
        System.out.println(sb.toString());
    }
}
