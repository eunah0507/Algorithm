import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // 테스트케이스가 주어지면 for문을 돌려서 String을 charAt(0)을 대문자로

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String answer = "";

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            char ch = ' ';

            for (int j = 0; j < str.length(); j++) {
                ch = str.charAt(j);

                if (j == 0){
                  ch = Character.toUpperCase(str.charAt(0));
                }
                sb.append(ch);
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}