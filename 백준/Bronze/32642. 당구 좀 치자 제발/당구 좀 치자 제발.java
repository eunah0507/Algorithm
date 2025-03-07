import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String [] str = br.readLine().split(" ");
        
        // 현재 분노
        long angry = 0;
        // 분노의 합
        long totalAnger = 0;

        for (int i = 0; i < num; i++) {
            long weather = Integer.parseInt(str[i]);

            if (weather == 1){
                angry++;
            }else{
                angry--;
            }

            totalAnger += angry;
        }

        sb.append(totalAnger);
        System.out.println(sb.toString());
        
    }
}
