import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // A와 B가 같은 숫자면 1 아니면 0 출력하기

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

       long N = sc.nextLong();
       long M = sc.nextLong();
       int answer = 2;

       if (N == M){
           answer = 1;
       }else{
           answer = 0;
       }

       sb.append(answer);

        System.out.println(sb.toString());

    }
}