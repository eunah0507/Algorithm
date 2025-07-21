import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String w = br.readLine();
        int m = Integer.parseInt(br.readLine());
        
        String[] words = br.readLine().split(" ");

        int count = 0;

        for (String word : words) {
            for (int i = 0; i <= word.length() - w.length(); i++) {
                if (word.substring(i, i + w.length()).equals(w)) {
                    count++;
                }
            }
        }

        sb.append(count);
        System.out.println(sb.toString());
    }
}
