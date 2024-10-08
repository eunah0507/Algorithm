import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int numA = 0;
        int numB = 0;
        int sum = 0;
        int count = 0;

        while(true) {
            if(sum >= m) {
                sum -= arr[numA++];
            }else if(numB == n){
                break;
            }
            else {
                sum += arr[numB++];
            }

            if(sum == m) {
                count++;
            }
        }

        sb.append(count);
        System.out.println(sb.toString());
    }
}
