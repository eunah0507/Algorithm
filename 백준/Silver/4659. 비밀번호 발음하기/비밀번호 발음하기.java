import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String pw = br.readLine();
            if (pw.equals("end")) {
                break;
            }

            boolean hasVowel = false;
            boolean acceptable = true;
            int vowelCount = 0;
            int consCount = 0;

            for (int i = 0; i < pw.length(); i++) {
                char c = pw.charAt(i);
                boolean isVowel = isVowel(c);

                if (isVowel) {
                    hasVowel = true;
                    vowelCount++;
                    consCount = 0;
                } else {
                    consCount++;
                    vowelCount = 0;
                }

                if (vowelCount == 3 || consCount == 3) {
                    acceptable = false;
                    break;
                }

                if (i > 0) {
                    char prev = pw.charAt(i - 1);
                    if (prev == c && !(c == 'e' || c == 'o')) {
                        acceptable = false;
                        break;
                    }
                }
            }

            if (!hasVowel) {
                acceptable = false;
            }

            if (acceptable) {
                sb.append("<").append(pw).append("> is acceptable.\n");
            } else {
                sb.append("<").append(pw).append("> is not acceptable.\n");
            }
        }

        System.out.print(sb.toString());
    }

    private static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else {
            return false;
        }
    }
}
