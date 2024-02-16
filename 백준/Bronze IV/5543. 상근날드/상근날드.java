import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main extends Exception{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int [] hamburger = new int [3];
        int [] drink = new int [2];

        for (int i = 0; i < hamburger.length; i++) {
            hamburger[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < drink.length; i++) {
            drink[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(hamburger);
        Arrays.sort(drink);

        int answer = hamburger[0] + drink[0] - 50;

        sb.append(answer);

        System.out.println(sb.toString());
    }
}