import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 다섯가지 조건에 맞춰 출력하기

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String str = sc.next();

        if (str.equals("M")){
            sb.append("MatKor");
        }else if(str.equals("W")){
            sb.append("WiCys");
        }else if(str.equals("C")){
            sb.append("CyKor");
        }else if(str.equals("A")){
            sb.append("AlKor");
        }else if(str.equals("$")){
            sb.append("$clear");
        }

        System.out.println(sb.toString());

    }
}
