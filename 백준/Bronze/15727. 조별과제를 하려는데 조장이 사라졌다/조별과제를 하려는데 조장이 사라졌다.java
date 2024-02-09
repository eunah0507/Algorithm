import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 1분에 1~5만큼 이동할 수 있을 때
        // 입력받은 거리를 몇 분만에 갈 수 있는지

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        int answer = 0;

        while(true){
            if (num <= 5){
                break;
            }
            
            num = num - 5;
            answer++;
        }

        sb.append(answer+1);
        System.out.println(sb.toString());

    }
}
