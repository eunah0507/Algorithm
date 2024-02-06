import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {

        // 오늘 날짜 출력하기
        SimpleDateFormat dateNow = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();

        System.out.println(dateNow.format(now));


    }
}