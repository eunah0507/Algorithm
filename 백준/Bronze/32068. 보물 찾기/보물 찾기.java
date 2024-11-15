import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // 홀수일때는 더하고, 짝수일 때는 뺀다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int index = 0;

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            int startPoint = Integer.parseInt(st.nextToken());

            int letfToStart = startPoint - left;
            int rightToStart = right - startPoint;
            
            if (letfToStart < rightToStart){
                index = letfToStart * 2 + 1;
            }else {
                index = 2 * rightToStart;
            }
            
            sb.append(index).append("\n");
        }

        System.out.println(sb.toString());
    }
}
