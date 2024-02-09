import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 입력받은 세가지 수 중, 가운데 수 출력하기

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int [] arr = new int [3];

        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        sb.append(arr[1]);
        System.out.println(sb.toString());
    }
}
