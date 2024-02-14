import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int count = 0;

        while (true) {
            String arr = sc.nextLine();
            String str = arr.toLowerCase();

            if (str.equals("#")) {
                break;
            } else {
                    count = 0;
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);

                    if (ch == 'a') {
                        count++;
                    } else if (ch == 'e') {
                        count++;
                    } else if (ch == 'i') {
                        count++;
                    } else if (ch == 'o') {
                        count++;
                    } else if (ch == 'u') {
                        count++;
                    }
                }
                sb.append(count);
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
