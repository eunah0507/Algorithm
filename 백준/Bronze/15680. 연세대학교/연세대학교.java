import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 0일 때 연세대학교 영문명 출력
        // 1일 때 연세대학교 슬로건 출력

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        if (A == 0){
            System.out.println("YONSEI");
        }

        if(A == 1){
            System.out.println("Leading the Way to the Future");
        }

    }
}