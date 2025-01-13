import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        String minLeft = st.nextToken();
        String minRight = st.nextToken();
        String taeLeft = st.nextToken();
        String taeRight = st.nextToken();

        String answer = "";

        if ((minRight.equals(minLeft)) && (taeLeft.equals(taeRight))){
            if (minRight.equals("R") && taeRight.equals("S")){
                answer = "MS";
            }else if (minRight.equals("R") && taeRight.equals("R")){
                answer = "?";
            }else if (minRight.equals("R") && taeRight.equals("P")){
                answer = "TK";
            }else if (minRight.equals("S") && taeRight.equals("S")){
                answer = "?";
            }else if (minRight.equals("S") && taeRight.equals("R")){
                answer = "TK";
            }else if (minRight.equals("S") && taeRight.equals("P")){
                answer = "MS";
            }if (minRight.equals("P") && taeRight.equals("S")){
                answer = "TK";
            }else if (minRight.equals("P") && taeRight.equals("R")){
                answer = "MS";
            }else if (minRight.equals("P") && taeRight.equals("P")){
                answer = "?";
            }
        }else if (minRight.equals(minLeft)){
            if (minRight.equals("P") && (taeRight.equals("S") || taeLeft.equals("S"))) {
                answer = "TK";
            }else if (minRight.equals("S") && (taeRight.equals("R") || taeLeft.equals("R"))){
                answer = "TK";
            }else if (minRight.equals("R") && (taeRight.equals("P") || taeLeft.equals("P"))){
                answer = "TK";
            }else{
                answer = "?";
            }
        }else if (taeRight.equals(taeLeft)){
            if (taeRight.equals("P") && (minRight.equals("S") || minLeft.equals("S"))) {
                answer = "MS";
            }else if (taeRight.equals("S") && (minRight.equals("R") || minLeft.equals("R"))){
                answer = "MS";
            }else if (taeRight.equals("R") && (minRight.equals("P") || minLeft.equals("P"))){
                answer = "MS";
            }else{
                answer = "?";
            }
        }else{
            answer = "?";
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}