import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());
        int numC = Integer.parseInt(st.nextToken());
        
        if(numA + numB == numC) {
            sb.append(numA).append("+").append(numB).append("=").append(numC).append("\n");
        }else if(numA - numB == numC) {
            sb.append(numA).append("-").append(numB).append("=").append(numC).append("\n");
        }else if(numA * numB == numC) {
            sb.append(numA).append("*").append(numB).append("=").append(numC).append("\n");
        }else if(numA / numB == numC) {
            sb.append(numA).append("/").append(numB).append("=").append(numC).append("\n");
        }else if(numA == numB + numC) {
            sb.append(numA).append("=").append(numB).append("+").append(numC).append("\n");
        }else if(numA == numB - numC) {
            sb.append(numA).append("=").append(numB).append("-").append(numC).append("\n");
        }else if(numA == numB * numC) {
            sb.append(numA).append("=").append(numB).append("*").append(numC).append("\n");
        }else if(numA == numB / numC) {
            sb.append(numA).append("=").append(numB).append("/").append(numC).append("\n");
        }

        System.out.println(sb.toString());

    }
}
