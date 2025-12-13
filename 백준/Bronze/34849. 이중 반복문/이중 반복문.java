import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        long answer = (long) num * num;
        long computer = 100_000_000L;

        if (answer <= computer){
            sb.append("Accepted");
        }else{
            sb.append("Time limit exceeded");
        }

        System.out.println(sb.toString());
    }
}
