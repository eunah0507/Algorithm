import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int price = Integer.parseInt(br.readLine());
        int change = 1000 - price;

        int[] coins = {500, 100, 50, 10, 5, 1};
        int count = 0;

        for (int coin : coins) {
            count += change / coin;
            change %= coin;
        }
        
        sb.append(count);
        System.out.println(sb.toString());
    }
}
