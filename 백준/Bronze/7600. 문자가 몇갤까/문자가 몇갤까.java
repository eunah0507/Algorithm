import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            str = str.toLowerCase();
            int count = 0;

            if (str.equals("#")) {
                break;
            } else {

                int[] arr = new int[26];

                for (int i = 0; i < str.length(); i++) {
                    if (Character.isAlphabetic(str.charAt(i))) {
                        arr[str.charAt(i) - 97] = 1;
                    } else {
                        continue;
                    }
                }

                for (int i = 0; i < 26; i++) {
                    count += arr[i];
                }
            }

            sb.append(count).append("\n");
        }
        System.out.println(sb.toString());
    }
}