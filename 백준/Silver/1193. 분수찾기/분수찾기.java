import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        // N개의 문제 후보, M개의 찬반 의견
        // M은 항상 홀수이며, 과반수를 넘어야 출제된다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        int before= 0;
        int tmp = 0;
        int line = 1;

        while(true){
            before = tmp;
            tmp += line;
            if(before <= num && num <= tmp ){
                break;
            }
            line++;
        }

        int up = 0;
        int down = 0;
        int remainNum = num - before;

        if(line %2 ==0){
            up = 1;
            down = line;
            for (int i = 1; i < remainNum; i++) {
                up++;
                down--;
            }

        }else {
            up = line;
            down = 1;
            for (int i = 1; i < remainNum; i++) {
                up--;
                down++;
            }

        }

        sb.append(up).append("/").append(down);
        System.out.println(sb.toString());

    }
}