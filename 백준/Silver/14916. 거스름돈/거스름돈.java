import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int money = Integer.parseInt(br.readLine());
        int fiveMax = money / 5;
        int twoMax = 0;

        while (fiveMax >=0){
            int tempMoney = money;
            tempMoney -= (fiveMax*5);
            if(tempMoney % 2 ==0){
                twoMax = tempMoney/2;
                break;
            }

            fiveMax--;
        }
        if(fiveMax <0){
            System.out.println(-1);
        }else {
            System.out.println(fiveMax+twoMax);
        }


    }
}
