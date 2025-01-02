import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();
        if(S.contains("A")){
            S = S.replaceAll("B","A");
            S = S.replaceAll("C","A");
            S = S.replaceAll("D","A");
            S = S.replaceAll("F","A");
        }else if(S.contains("B")){
            S = S.replaceAll("C","B");
            S = S.replaceAll("D","B");
            S = S.replaceAll("F","B");
        }else if(S.contains("C")){
            S = S.replaceAll("D","C");
            S = S.replaceAll("F","C");
        }else {
            StringBuilder tmp = new StringBuilder();
            for(char chr : S.toCharArray()){
                tmp.append("A");
            }
            S = tmp.toString();
        }
        System.out.println(S);

    }
}
