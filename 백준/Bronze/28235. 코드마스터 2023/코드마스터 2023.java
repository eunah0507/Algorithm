import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        // 입력받은 문구에 맞춰 대답하기

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String str = sc.next();
        if (str.equals("SONGDO")){
            sb.append("HIGHSCHOOL");
        }else if(str.equals("CODE")){
            sb.append("MASTER");
        }else if(str.equals("2023")){
            sb.append("0611");
        }else if(str.equals("ALGORITHM")){
            sb.append("CONTEST");
        }

        System.out.println(sb.toString());
    }
}