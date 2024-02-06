import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 재환이가 병원에 갈지 말지

        // 의사보다 ah를 길게 내면 no
        // 의사보다 ah를 짧게 내면 go

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String Jae = sc.next();
        String doctor = sc.next();
        String answer = "";

        if (doctor.length() > Jae.length()){
            answer = "no";
        }else{
            answer = "go";
        }

        sb.append(answer);

        System.out.println(sb.toString());

    }
}