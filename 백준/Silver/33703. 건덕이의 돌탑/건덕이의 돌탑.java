import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        
        long result = (long) num * (num + 1) / 2;
        
        sb.append(result).append("\n");

        System.out.println(sb.toString());
    }
}
