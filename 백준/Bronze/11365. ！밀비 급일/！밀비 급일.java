import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            String str = br.readLine();

            if (str.contains("END")){
                break;
            }else{
                String reverse = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    reverse += str.charAt(i);
                }
                    sb.append(reverse).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}