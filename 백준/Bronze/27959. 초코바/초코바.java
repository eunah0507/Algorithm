import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        // 100원짜리 동전 N개가 있을 때 M원인 초코바를 사 먹을 수 있나?
        // 가능하면 Yes, 아니면 No 출력

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

       int money = sc.nextInt();
       int chocobar = sc.nextInt();
       String answer = "";

       if (money * 100 >= chocobar){
           answer = "Yes";
       }else{
           answer = "No";
       }

       sb.append(answer);
        System.out.println(sb.toString());
    }
}