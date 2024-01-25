import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        // x,y 좌표순서대로 정렬하는 문제
        // 단, x,y가 같다면 그대로 둔다.

        // 1. 테스트케이스 int를 받아온다.
        // 2. 열은 2으로, 행은 num으로된 2차원 배열을 만든다.
        // 3. for문을 돌려 값을 채운다.
        // 4. 람다식을 전개한다.
        // 4-1. 람다식 안에 if문을 사용해 오름차순으로 정렬한다.
        // 5. for문을 돌려 출력한다.

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        // 테스트케이스를 받아온다.
        int num = sc.nextInt();
        // 열이 2개이므로 행은 num으로, 열은 2로 받아온다.
        int [][] arr = new int [num][2];

        // 2중 for문을 돌려 arr[i][j]를 채운다.
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 정렬하되, 람다식을 이용하여 정렬한다.
        Arrays.sort(arr, (e1, e2) -> {
            // 0번째 행끼리 오름차순 정렬하되, 왼쪽이 작으면 그대로 둔다.
            if (e1[1] < e2[1]){
                return -1;
                // 0번째 행끼리 오름차순 정렬하되, 왼쪽이 크면 바꾼다.
            } else if(e1[1] > e2[1]){
                return 1;
                // 0번째 행끼리 오름차순 정렬하되, 그 외는 둘이 같다는 것이므로 다시 조건을 세운다.
            } else {
                // -1 : 그대로 둔다 , 1 : 바꾼다 , 0 : 그대로 둔다.(-1 써도 상관없음)
                if (e1[0] < e2[0]){
                    return -1;
                } else if (e1[0] > e2[0]){
                    return 1;
                }else {
                    return 0;
                }
            }
        });

        // 다시 2중 for문을 돌려서 답을 출력한다.
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 2; j++) {
               sb.append(arr[i][j]);
               sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}