import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        // for문을 티기고 티기고 티기는 문제~

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long num = Long.parseLong(br.readLine());
        long method = Long.parseLong(br.readLine());

        if(num >= 6){
            System.out.println("Love is open door");
        }else{
            int door;
            if(method == 0){
                door = 1;
            }else {
                door = 0;
            }

            for (long i = 1; i < num; i++) {
                sb.append(door).append("\n");
                door = door == 0 ? 1 : 0;
            }
            System.out.print(sb.toString());
        }

    }
    /*
    *
    * */
}