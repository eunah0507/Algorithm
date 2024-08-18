import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isWhite = true;
        int count = 0;

        for (int i = 0; i < 8 ; i++) {
            String str = br.readLine();
            isWhite = i % 2 == 0;
            for (int j = 0; j < 8; j++) {
                if(isWhite && str.charAt(j)=='F') count++;
                isWhite = !isWhite;
            }
        }
        System.out.println(count);
    }
}
