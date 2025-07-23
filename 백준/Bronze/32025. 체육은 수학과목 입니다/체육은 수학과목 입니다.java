import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int h = Integer.parseInt(br.readLine());
        int w = Integer.parseInt(br.readLine());
        int answer = Math.min(h, w) * 50;
        
        sb.append(answer).append('\n');
        System.out.print(sb.toString());
    }
}
