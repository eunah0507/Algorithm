import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String str = sc.next();

        if (str.equals("NLCS")){
            sb.append("North London Collegiate School");
        }else if(str.equals("BHA")){
            sb.append("Branksome Hall Asia");
        }else if(str.equals("KIS")){
            sb.append("Korea International School");
        }else if(str.equals("SJA")){
            sb.append("St. Johnsbury Academy");
        }

        System.out.println(sb.toString());
    }
}
