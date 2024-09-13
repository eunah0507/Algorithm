import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int numA = Integer.parseInt(br.readLine());
        int numB = Integer.parseInt(br.readLine());
        int numC = Integer.parseInt(br.readLine());

        int sumABC = numA + numB + numC;

        if (numA == 60 && numA == numB && numB == numC){
            sb.append("Equilateral").append("\n");
        }else if(sumABC == 180 && ((numA == numB) && (numA != numC))) {
            sb.append("Isosceles").append("\n");
        } else if (sumABC == 180 && ((numC == numB) && (numA != numC))) {
            sb.append("Isosceles").append("\n");
        } else if (sumABC == 180 && ((numC == numA) && (numB != numC))){
            sb.append("Isosceles").append("\n");
        }else if (sumABC == 180 && numA != numB){
            sb.append("Scalene").append("\n");
        } else if (sumABC != 180) {
            sb.append("Error").append("\n");
        }

        System.out.println(sb.toString());
    }
}
