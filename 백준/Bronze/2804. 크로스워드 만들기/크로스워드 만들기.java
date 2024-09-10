import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        char[] A = st.nextToken().toCharArray();
        char[] B = st.nextToken().toCharArray();

        int idx_A = -1;
        int idx_B = -1;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    idx_A = i;
                    idx_B = j;
                    break;
                }
            }
            if (idx_A != -1)
                break;
        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (idx_A == j && idx_B == i){
                    sb.append(A[j]);
                } else if (idx_B == i) {
                    sb.append(A[j]);
                } else if (idx_A == j) {
                    sb.append(B[i]);
                } else {
                    sb.append(".");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
