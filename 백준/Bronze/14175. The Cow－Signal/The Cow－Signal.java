import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] parts = br.readLine().split(" ");
        int m = Integer.parseInt(parts[0]);
        int n = Integer.parseInt(parts[1]);
        int k = Integer.parseInt(parts[2]);

        for (int i = 0; i < m; i++) {
            String line = br.readLine();
            for (int t = 0; t < k; t++) {
                for (int j = 0; j < n; j++) {
                    char ch = line.charAt(j);
                    for (int r = 0; r < k; r++) {
                        sb.append(ch);
                    }
                }
                sb.append('\n');
            }
        }

        System.out.print(sb.toString());
    }
}
