import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 두 양수가 주어졌을 때, 비교하는 문제

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while(true){
            int A = sc.nextInt();
            int B = sc.nextInt();
            String answer = "";

            if (A == 0 && B == 0){
                break;
            }else{
                if (A > B){
                    answer = "Yes";
                }else{
                    answer = "No";
                }
            }

            sb.append(answer);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}