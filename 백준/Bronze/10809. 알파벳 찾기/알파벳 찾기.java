import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';

            if (arr[index] == -1) {
                arr[index] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.print(sb.toString());
    }
}
