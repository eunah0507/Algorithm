import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // git 왜 안올라가지
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
           
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numA = Integer.parseInt(st.nextToken());  
            int numB = Integer.parseInt(st.nextToken());  

            if (numA == 0 && numB == 0) break;

            int[] listA = new int[numA];
            int[] listB = new int[numB];

            for (int i = 0; i < numA; i++) {
                listA[i] = Integer.parseInt(br.readLine());
            }
            for (int i = 0; i < numB; i++) {
                listB[i] = Integer.parseInt(br.readLine());
            }

            int pointerA = 0;
            int pointerB = 0;
            int answer = 0;

            while (pointerA < numA && pointerB < numB) {
                if (listA[pointerA] == listB[pointerB]) {
                    answer++;
                    pointerA++;
                    pointerB++;
                } else if (listA[pointerA] < listB[pointerB]) {
                    pointerA++;
                } else {
                    pointerB++;
                }
            }

            sb.append(answer).append("\n");
        }

        System.out.print(sb.toString());
    }
}
