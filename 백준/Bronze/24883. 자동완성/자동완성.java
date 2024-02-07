import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 주어진 알파벳이 N 또는 n 이면 "Naver D2",
        // 아니라면 "Naver Whale" 출력

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String str = sc.next();

        if (str.equals("N") || str.equals("n")){
            sb.append("Naver D2");
        }else{
            sb.append("Naver Whale");
        }

        System.out.println(sb.toString());
    }
}