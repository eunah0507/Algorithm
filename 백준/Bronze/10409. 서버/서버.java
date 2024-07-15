import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        
        int i = 0;

        st = new StringTokenizer(br.readLine());
        for(i = 0; i < num; i++) {
            
            T -= Integer.parseInt(st.nextToken());
            
            if(T < 0) {
                break;
            }
        }
        sb.append(i).append("\n");
        System.out.println(sb.toString());
    }
}
