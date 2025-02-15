import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numA = Integer.parseInt(br.readLine());
        int numB = Integer.parseInt(br.readLine());
        String answer = "";

        if (numA > numB){
            answer = "flight";
        }else{
            answer = "high speed rail";
        }
        
        sb.append(answer);
        System.out.println(sb.toString());
    }
}