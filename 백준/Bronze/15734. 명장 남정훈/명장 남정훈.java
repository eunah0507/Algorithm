import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int sum = l + r + b;
        int temp = b - Math.abs(l-r);
        int answer = 0;
        
        if (temp >= 0){
            answer = sum - temp % 2;
        }else{
            answer = sum - Math.abs(temp);
        }
        
        sb.append(answer);
        System.out.println(sb.toString());

    }
}
