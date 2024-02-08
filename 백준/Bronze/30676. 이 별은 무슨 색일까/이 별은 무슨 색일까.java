import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 빨간색: 620nm 이상 780nm 이하
        // 주황색: 590nm 이상 620nm 미만
        // 노란색: 570nm 이상 590nm 미만
        // 초록색: 495nm 이상 570nm 미만
        // 파란색: 450nm 이상 495nm 미만
        // 남색: 425nm 이상 450nm 미만
        // 보라색: 380nm 이상 425nm 미만

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

            if (num >= 620 && num <= 780) {
                sb.append("Red");
            } else if (num >= 590 && num < 620) {
                sb.append("Orange");
            } else if (num >= 570 && num < 590) {
                sb.append("Yellow");
            } else if (num >= 495 && num < 570) {
                sb.append("Green");
            } else if (num >= 450 && num < 495) {
                sb.append("Blue");
            } else if (num >= 425 && num < 450) {
                sb.append("Indigo");
            } else if (num >= 380 && num < 425) {
                sb.append("Violet");
            }

        sc.close();

        System.out.println(sb.toString());
    }
}