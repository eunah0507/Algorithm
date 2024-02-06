import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 창문이 열려있으면 닫고, 닫혀있으면 열기

        // num = 3 // 1 0 0
        // num = 4 // 1 0 0 1
        // num = 5 // 1 0 0 1 0
        // num = 6 // 1 0 0 1 0 0
        // 이렇듯, n에 루트씌운 수만큼 1이 나오는 것을 확인할수 있다.
        // 그냥 다른 설계 다 필요없고, 입력받은 num에 루트씌워서 int로 출력

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        int count = 0;

        count = (int)Math.sqrt(num);

        sb.append(count);
        System.out.println(sb.toString());
    }
}