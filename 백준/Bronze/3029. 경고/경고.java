import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        int currentHour = Integer.parseInt(st.nextToken());
        int currentMinutes = Integer.parseInt(st.nextToken());
        int currentSeconds = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), ":");

        int bombHour = Integer.parseInt(st.nextToken());
        int bombMinutes = Integer.parseInt(st.nextToken());
        int bombSecons = Integer.parseInt(st.nextToken());

        int answerHour = 0;
        int answerMinutes = 0;
        int answerSeconds = 0;

        String answerH, answerM, answerS;



        if (bombSecons < currentSeconds){
            answerSeconds = (60 + bombSecons) - currentSeconds;
            bombMinutes--;
        }else{
            answerSeconds = bombSecons - currentSeconds;
        }

        if (bombMinutes < currentMinutes){
            answerMinutes = (60 + bombMinutes) - currentMinutes;
            bombHour--;
        }else{
            answerMinutes = bombMinutes - currentMinutes;
        }

        if (bombHour >= currentHour){
            answerHour = bombHour - currentHour;
        }else{
            answerHour = (24+bombHour) - currentHour;
        }

        if (answerHour == 0 && answerMinutes == 0 && answerSeconds == 0){
            answerHour = 24;
        }

        if (answerSeconds < 10){
            answerS = "0" + answerSeconds;
        }else{
            answerS = String.valueOf(answerSeconds);
        }

        if (answerMinutes < 10){
            answerM = "0" + answerMinutes;
        }else{
            answerM = String.valueOf(answerMinutes);
        }

        if (answerHour < 10){
            answerH = "0" + answerHour;
        }else{
            answerH = String.valueOf(answerHour);
        }


        sb.append(answerH).append(":").append(answerM).append(":").append(answerS);
        System.out.println(sb.toString());
    }
}
