import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 지금 시간을 UTC+0으로 한줄씩 출력하기

        Scanner sc = new Scanner(System.in);

        Date date = new Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM");
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("dd");

        System.out.println(simpleDateFormat1.format(date));
        System.out.println(simpleDateFormat2.format(date));
        System.out.println(simpleDateFormat3.format(date));
    }
}
