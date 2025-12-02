import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String str = br.readLine();

            if (str.equals("yonsei")){
                sb.append("Yonsei Won!");
                break;
            }else if (str.equals("korea")){
                sb.append("Yonsei Lost...");
                break;
            }
        }

        System.out.println(sb.toString());
    }
}
