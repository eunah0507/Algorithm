import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            String str = br.readLine();

            if (str.equals("end")){
                break;
            }else{
                if (str.equals("animal")){
                    sb.append("Panthera tigris").append("\n");
                }else if (str.equals("tree")){
                    sb.append("Pinus densiflora").append("\n");
                }else if (str.equals("flower")){
                    sb.append("Forsythia koreana").append("\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}
