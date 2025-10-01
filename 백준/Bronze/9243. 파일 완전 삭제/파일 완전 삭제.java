import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        String before = br.readLine();
        String after = br.readLine();

        boolean success = true;

        if (N % 2 == 0) { 
            if (!before.equals(after)) success = false;
        } else { 
            for (int i = 0; i < before.length(); i++) {
                if (before.charAt(i) == after.charAt(i)) {
                    success = false;
                    break;
                }
            }
        }

        if (success) sb.append("Deletion succeeded");
        else sb.append("Deletion failed");

        System.out.print(sb.toString());
    }
}
