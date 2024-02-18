import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int vacation = Integer.parseInt(br.readLine());
        int totalKorean = Integer.parseInt(br.readLine());
        int totalMath = Integer.parseInt(br.readLine());
        int oneDayKorean = Integer.parseInt(br.readLine());
        int oneDayMath = Integer.parseInt(br.readLine());

        int studyKorean = 0;
        int studyMath = 0;

        if (totalKorean % oneDayKorean != 0) {
             studyKorean = (totalKorean / oneDayKorean) + 1;
        }else{
            studyKorean = totalKorean / oneDayKorean;
        }

        if (totalMath % oneDayMath != 0){
            studyMath = (totalMath / oneDayMath) + 1;
        }else{
            studyMath = totalMath / oneDayMath;
        }

        int totalStudy = vacation - Math.max(studyKorean, studyMath);

        sb.append(totalStudy);
        System.out.println(sb.toString());
    }
}