import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // 범위지정에 주의하자

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String [] arr = new String [str.length()];

        for (int i = 1; i <= str.length(); i++) {
            arr[i-1] = str.substring(str.length()-i);
        }

        Arrays.sort(arr);

        for (String s : arr) {
            sb.append(s).append("\n");
        }

        System.out.println(sb.toString());
    }
}