import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); 
        int d = Integer.parseInt(st.nextToken()); 
        int k = Integer.parseInt(st.nextToken()); 

        int[] s = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(st.nextToken());
        }

        int[] stars = new int[n];  
        int cleanCount = 0;

        for (int day = 0; day < d; day++) {
            boolean needClean = false;
            for (int i = 0; i < n; i++) {
                stars[i] += s[i];
                if (stars[i] > k) {
                    needClean = true;
                }
            }

            if (needClean) {
                cleanCount++;
                Arrays.fill(stars, 0);  
                for (int i = 0; i < n; i++) {
                    stars[i] += s[i]; 
                }
            }
        }

        System.out.println(cleanCount);
    }
}
