import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String stationA = br.readLine();
        String stationB = br.readLine();
        
        int answer = 0;
        
        if (stationA.equals(stationB)){
            answer = 0;
        }else{
            answer = 1550;
        }
        
        sb.append(answer);
        System.out.println(sb.toString());
    }
}
