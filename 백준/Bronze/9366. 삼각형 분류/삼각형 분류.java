import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String answer = "";

        for (int i = 1; i <= num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int numA = Integer.parseInt(st.nextToken());
            int numB = Integer.parseInt(st.nextToken());
            int numC = Integer.parseInt(st.nextToken());

            int max = Math.max(Math.max(numA, numB),numC);
            int sum = numA + numB + numC;

            if (sum - max > max){
                if (numA == numB && numB == numC){
                    answer = "equilateral";
                }else if(numA == numB){
                    answer = "isosceles";
                }else if (numB == numC){
                    answer = "isosceles";
                }else if(numA == numC){
                    answer = "isosceles";
                }else if((numA != numB) && (numA != numC)){
                    answer = "scalene";
                }else{
                    answer = "invalid!";
                }
            }else{
                answer = "invalid!";
            }

            sb.append("Case #").append(i).append(": ").append(answer).append("\n");
        }

        System.out.println(sb.toString());

    }
}
