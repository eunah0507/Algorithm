import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int answer=0;
        for(int i=1; i<=n; i++){
            if(String.valueOf(i).contains("50")){
                answer+=2;
            }
            else{
                answer+=1;
            }
        }
        answer= String.valueOf(n).contains("50") ? answer-=1 : answer;
        System.out.println(answer);


    }
}