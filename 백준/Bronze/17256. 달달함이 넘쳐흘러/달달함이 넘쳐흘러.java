import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int az = sc.nextInt();
        int cx = sc.nextInt();
        int cy = sc.nextInt();
        int cz = sc.nextInt();
        int bx = cx - az;
        int by = cy / ay;
        int bz = cz - ax;

        sb.append(bx + " ");
        sb.append(by + " ");
        sb.append(bz + " ");

        System.out.println(sb.toString());
    }
}
