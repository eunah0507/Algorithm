import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        String[] palindrome = br.readLine().split(" ");
        Set<Character> result = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            result.add(palindrome[i].charAt(0));
        }
        
        sb.append(result.size() == 1 ? "1" : "0").append("\n");
        System.out.print(sb.toString());
    }
}