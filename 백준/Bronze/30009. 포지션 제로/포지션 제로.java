import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); 
        String[] parts = br.readLine().split(" ");
        int X = Integer.parseInt(parts[0]); 
        int Y = Integer.parseInt(parts[1]);
        int R = Integer.parseInt(parts[2]); 

        int A = 0; 
        int B = 0;

        for (int i = 0; i < N; i++) {
            int Ti = Integer.parseInt(br.readLine());

            int dx = Ti - X;
            int distSq = dx * dx;
            int radiusSq = R * R;       

            if (distSq < radiusSq) {
                A++; 
            } else if (distSq == radiusSq) {
                B++;
            }
        }

        sb.append(A).append(" ").append(B);
        System.out.println(sb.toString());
    }
}
