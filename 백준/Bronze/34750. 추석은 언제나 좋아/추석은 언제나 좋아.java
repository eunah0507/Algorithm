import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.valueOf(br.readLine());
        double parent = 0;

        if (num >= 1000000){
            parent = num * 0.2;
        }else if(num >= 500000){
            parent = num * 0.15;
        }else if (num >= 100000){
            parent = num * 0.1;
        }else{
            parent = num * 0.05;
        }

        int parentMoney = (int)parent;
        int jaemin = num - parentMoney;

        sb.append(parentMoney).append(" ").append(jaemin);
        System.out.println(sb.toString());
    }
}
