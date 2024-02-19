import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // 친구의 수 N이 주어진다.
        // 엘리스 트랙에 대한 정부 N개가 주어진다.
        // 헬로빗이 지원하는 트랙과 같은 트랙을 지원하는 친구가 몇명인가?

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        sc.nextLine();
        String helloFriends = sc.nextLine();
        char hellobit = sc.nextLine().charAt(0);
        int count = 0;

        for (char ch : helloFriends.toCharArray()) {
            if (ch == hellobit){
                count++;
            }
        }
        sb.append(count);
        System.out.println(sb.toString());
    }
}