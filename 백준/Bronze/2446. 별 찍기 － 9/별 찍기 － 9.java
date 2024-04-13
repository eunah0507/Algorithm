import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine())-1;
        StringBuilder sb = new StringBuilder();

        for (int i = N; i >= 0; i--) {
            int empty = ((N*2-1)-(i*2-1))/2;
            int star = i*2+1;
            for (int j = 0; j < empty; j++) {
                sb.append(' ');
            }
            for (int j = 0; j < star; j++) {
                sb.append('*');
            }
//            for (int j = 0; j < empty; j++) {
//                sb.append(' ');
//            }
            sb.append('\n');
        }
        for (int i = 1; i <= N; i++) {
            int empty = ((N*2-1)-(i*2-1))/2;
            int star = i*2+1;
            for (int j = 0; j < empty; j++) {
                sb.append(' ');
            }
            for (int j = 0; j < star; j++) {
                sb.append('*');
            }
//            for (int j = 0; j < empty; j++) {
//                sb.append(' ');
//            }
            sb.append('\n');
        }
        System.out.print(sb.toString());


    }
}