import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] size = br.readLine().split(" ");
        int N = Integer.parseInt(size[0]);
        int M = Integer.parseInt(size[1]); 

        boolean[] rowHasGuard = new boolean[N]; 
        boolean[] colHasGuard = new boolean[M]; 

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'X') {
                    rowHasGuard[i] = true;
                    colHasGuard[j] = true;
                }
            }
        }

        int rowCount = 0, colCount = 0;
        for (boolean hasGuard : rowHasGuard) {
            if (!hasGuard) rowCount++;
        }
        for (boolean hasGuard : colHasGuard) {
            if (!hasGuard) colCount++;
        }

        sb.append(Math.max(rowCount, colCount));
        System.out.println(sb.toString()); 
    }
}
