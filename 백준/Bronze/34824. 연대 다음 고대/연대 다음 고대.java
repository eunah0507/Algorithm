import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String [] arr = new String[num];

        int yonsei = 0;
        int korea = 0;

        for (int i = 0; i < num; i++) {
            arr[i] = br.readLine();

            if (arr[i].equals("yonsei")){
                yonsei = i;
            }

            if (arr[i].equals("korea")){
                korea = i;
            }
        }

        if (yonsei < korea){
            sb.append("Yonsei Won!");
        }else{
            sb.append("Yonsei Lost...");
        }

        System.out.println(sb.toString());
    }
}
