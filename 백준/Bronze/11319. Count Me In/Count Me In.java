import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int s = Integer.parseInt(br.readLine());

        String vowels = "AEIOUaeiou";

        for (int i = 0; i < s; i++) {
            String line = br.readLine();
            int vowelCount = 0;
            int consonantCount = 0;

            for (int j = 0; j < line.length(); j++) {
                char ch = line.charAt(j);
                if (ch == ' ') continue;

                if (vowels.indexOf(ch) >= 0) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }

            sb.append(consonantCount).append(" ").append(vowelCount).append("\n");
        }

        System.out.print(sb.toString());
    }
}
