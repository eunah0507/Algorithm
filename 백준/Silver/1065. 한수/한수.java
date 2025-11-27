import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine().trim());
        int answer = 0;

        for (int i = 1; i <= num; i++) {
            if (isHansu(i)) answer++;
        }

        sb.append(answer);
        System.out.print(sb.toString());
    }

    private static boolean isHansu(int x) {
        if (x < 100) return true;  

        int a = x / 100;       
        int b = (x / 10) % 10;  
        int c = x % 10;         

        return (a - b) == (b - c);
    }
}
