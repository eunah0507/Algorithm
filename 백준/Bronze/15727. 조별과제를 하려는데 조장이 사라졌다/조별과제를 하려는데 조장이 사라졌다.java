import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 1분에 1~5만큼 이동할 수 있을 때
        // 입력받은 거리를 몇 분만에 갈 수 있는지

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        int answer = 0;

        if (num % 5 != 0){
            answer = (num / 5) + 1;
        }else{
            answer = num / 5;
        }

       sb.append(answer);
       System.out.println(sb.toString());


    }
}