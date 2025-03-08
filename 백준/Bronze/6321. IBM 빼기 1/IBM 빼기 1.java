import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= num; i++) {
            String input = br.readLine();
            sb.append("String #").append(i).append("\n");
            
            for (char c : input.toCharArray()) {
                char nextChar = (c == 'Z') ? 'A' : (char) (c + 1);
                sb.append(nextChar);
            }
            
            sb.append("\n\n"); 
        }
        
        System.out.print(sb.toString());
    }
}
