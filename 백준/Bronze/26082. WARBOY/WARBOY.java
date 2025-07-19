import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] arr = br.readLine().split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]); 
        int c = Integer.parseInt(arr[2]); 

        int answer = (b / a) * 3 * c;

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
