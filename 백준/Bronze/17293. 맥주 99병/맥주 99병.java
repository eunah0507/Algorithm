import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int k = n; k >= 1; k--) {
            if (k == 1) {
                sb.append("1 bottle of beer on the wall, 1 bottle of beer.\n");
                sb.append("Take one down and pass it around, no more bottles of beer on the wall.\n\n");
            } else {
                sb.append(k).append(" bottles of beer on the wall, ").append(k).append(" bottles of beer.\n");
                sb.append("Take one down and pass it around, ");
                if (k - 1 == 1) {
                    sb.append("1 bottle of beer on the wall.\n\n");
                } else {
                    sb.append(k - 1).append(" bottles of beer on the wall.\n\n");
                }
            }
        }

        sb.append("No more bottles of beer on the wall, no more bottles of beer.\n");
        sb.append("Go to the store and buy some more, ");
        if (n == 1) {
            sb.append("1 bottle of beer on the wall.");
        } else {
            sb.append(n).append(" bottles of beer on the wall.");
        }

        System.out.print(sb.toString());
    }
}
