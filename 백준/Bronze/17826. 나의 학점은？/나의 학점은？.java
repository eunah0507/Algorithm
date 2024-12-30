import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] grade = new int [50];
        int index = 0;
        String answer = "";

        for (int i = 0; i < 50; i++) {
            grade[i] = Integer.parseInt(st.nextToken());
        }

        int hong = Integer.parseInt(br.readLine());

        for (int i = 0; i < 50; i++) {
            index++;

            if (hong == grade[i]){
                break;
            }
        }

        if (index <= 5){
            answer = "A+";
        }else if(index <= 15){
            answer = "A0";
        }else if (index <= 30){
            answer = "B+";
        }else if (index <= 35){
            answer = "B0";
        }else if (index <= 45){
            answer = "C+";
        }else if (index <= 48){
            answer = "C0";
        }else{
            answer = "F";
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}
