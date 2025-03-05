import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        
        sb.append("SN ").append(N);
        
        if (M <= 26) {
            sb.append((char) ('A' + M - 1));
        } else {
            M -= 27; 
            sb.append((char) ('a' + (M / 26)));
            sb.append((char) ('a' + (M % 26)));
        }
        
        System.out.println(sb.toString());
    }
}
