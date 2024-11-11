import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();

            if (str.equals("#")) {
                break;
            } else {
                String strArr[] = str.toLowerCase().split("");

                int count = 0;
                for (int i = 0; i < strArr.length; i++) {
                    if (str.split(" ")[0].equals(strArr[i]))
                        count++;
                }
                sb.append(str.split(" ")[0]).append(" ").append(count - 1).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
