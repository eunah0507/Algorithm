package Stack_Queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Groom_01 {


    class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int E = 0;
            int I = 0;
            int N = 0;
            int S = 0;
            int F = 0;
            int T = 0;
            int P = 0;
            int J = 0;

            String answer = "";

            for(int i = 0; i < n; i++){
                String str = br.readLine();
                answer = "";
                E = 0;
                I = 0;
                N = 0;
                S = 0;
                T = 0;
                F = 0;
                P = 0;
                J = 0;
                for(int j = 0; j < m; j++){
                    char ch = str.charAt(j);

                    if(ch == 'E'){
                        E++;
                    }else if(ch == 'I'){
                        I++;
                    }else if(ch == 'N'){
                        N++;
                    }else if(ch == 'S'){
                        S++;
                    }else if(ch == 'F'){
                        F++;
                    }else if(ch == 'T'){
                        T++;
                    }else if(ch == 'P'){
                        P++;
                    }else if(ch == 'J'){
                        J++;
                    }
                }

                if(E >= I){
                    answer += "E";
                }else{
                    answer += "I";
                }

                if(S >= N){
                    answer += "S";
                }else{
                    answer += "N";
                }

                if(T >= F){
                    answer += "T";
                }else{
                    answer += "F";
                }

                if(J >= P){
                    answer += "J";
                }else{
                    answer += "P";
                }

                sb.append(answer).append("\n");
            }

            System.out.println(sb.toString());
        }
    }
}
