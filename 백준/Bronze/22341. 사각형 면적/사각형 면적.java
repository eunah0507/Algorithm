import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int cy = N;
        int cx = N;
        
        while (C-- > 0) {
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            
            if (y > cy || x > cx) continue;
            
            int ny = y, nx = cx, w = y * cx;
            if (w < cy * x) {
                ny = cy;
                nx = x;
            }
            
            cy = ny;
            cx = nx;
        }
        
        sb.append(cy * cx);
        System.out.println(sb.toString());
    }
}