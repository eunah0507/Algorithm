package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        char [] ch = str.toCharArray();
        String answer = "";

        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt){
            if (!Character.isAlphabetic(ch[lt])){
                lt++;
            }else if(!Character.isAlphabetic(ch[rt])){
                rt--;
            }else{
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;

                lt++;
                rt--;
            }
        }

        answer = String.valueOf(ch);
        sb.append(answer);
        System.out.println(sb.toString());
    }
}
