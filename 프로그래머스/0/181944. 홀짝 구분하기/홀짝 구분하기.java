import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int num = Integer.parseInt(br.readLine());
        String answer = "";
        
        if(num % 2 == 0){
            answer = num + " is even";
        }else{
            answer = num + " is odd";
        }
        
        sb.append(answer);
        System.out.println(sb.toString());
        
    }
}