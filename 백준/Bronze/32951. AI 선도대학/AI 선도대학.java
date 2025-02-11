import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        int answer = num - 2024;
        
        sb.append(answer);
        System.out.println(sb.toString());
    }
}