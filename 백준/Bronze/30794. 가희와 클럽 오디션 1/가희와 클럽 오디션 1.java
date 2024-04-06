import java.io.IOException;
import java.util.Scanner;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String a = sc.next();
        int answer = 0;

        if(a.equals("miss")) {
            answer = 0;
        }else if(a.equals("bad")) {
            answer = num * 200;
        }else if(a.equals("cool")) {
            answer = num * 400;
        }else if(a.equals("great")) {
            answer = num * 600;
        }else if(a.equals("perfect")) {
            answer = num * 1000;
        }

        System.out.println(answer);
        sc.close();

    }
}