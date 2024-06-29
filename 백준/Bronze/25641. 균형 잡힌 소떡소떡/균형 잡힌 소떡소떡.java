import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int length = Integer.parseInt(br.readLine());
      String str = br.readLine();
      int sNum =0;
      int tNum =0;
      StringBuilder sb = new StringBuilder();
      
      for(char chr : str.toCharArray()) {
         if(chr == 's') {
            sNum++;
         }else if(chr == 't') {
            tNum++;
         }
      }
      if(sNum == tNum) {
         sb.append(str);
      }
      else {
         for(int i=0;i<str.length();i++) {
            int chr = str.charAt(i);
            if(chr == 's') {
               sNum--;
            }else if(chr == 't') {
               tNum--;
            }
            
            if(sNum == tNum) {
               sb.append(str.substring(i+1));
               break;
            }
            
         }
      }
      System.out.println(sb.toString());
      
   }
}
