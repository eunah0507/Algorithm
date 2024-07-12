import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        boolean change = false;
        int left = 0, right = 0;

        for (char chr : input.toCharArray()) {
            if (chr == ')') {
                change = true;
            }
            if (!change && chr == '@') {
                left++;
            }
            if (change && chr == '@') {
                right++;
            }
        }
        System.out.println(left + " " + right);

    }
}
