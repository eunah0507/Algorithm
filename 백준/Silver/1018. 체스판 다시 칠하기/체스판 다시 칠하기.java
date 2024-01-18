import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        // M*N 체스판을 몇 칸 다시 칠해야하는지 구하는 문제

        // 1. 테스트케이스 int 2개를 받는다.
        // 2. 테스트케이스로 2차원 배열을 만든다.
        // 3. for문을 돌려 배열 값을 채운다.
        // 4. 검정색 칸이 먼저 시작하는 체스판을 만든다.
        // 5. 흰 색 칸이 먼저 시작하는 체스판을 만든다.
        // 6. 테스트케이스로 만든 배열과 비교한다.
        // 7. 더 적은 수를 출력한다.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        // 테스트케이스를 입력받을 배열
        String [] arr = new String [N];

        // 테스트케이스와 비교하기 위한 W먼저 나오는 체스판
        String [] whiteBoard = new String [8];
        // 테스트케이스와 비교하기 위한 B먼저 나오는 체스판
        String [] blackBoard = new String [8];

        // 줄 단위로 입력받음
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        // W 먼저 나오는 흰색 체스판 만들기
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0){
                whiteBoard[i] = "WBWBWBWB";
            }else{
                whiteBoard[i] = "BWBWBWBW";
            }
        }

        // B먼저 나오는 검정 체스판 만들기
        for(int i = 0; i < 8; i++) {
            if(i % 2 == 0){
                blackBoard[i] = "BWBWBWBW";
            }
            else {
                blackBoard[i] = "WBWBWBWB";
            }
        }

        // 답을 출력할 변수를 만든다.
        // 초기값은 비교하기 위한 최소값, 8*8이므로 64를 준다.
        int answer = 64;

        // 4중 for문으로 비교하면서 고쳐야할 체스판 개수를 세어준다.
        for (int i = 0; i < (N - 7); i++) {
            for (int j = 0; j < (M - 7); j++) {
                int whiteCount = 0;
                int blackCount = 0;
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if (whiteBoard[k].charAt(l) != arr[i + k].charAt(j + l)){
                            whiteCount++;
                        }

                        if (blackBoard[k].charAt(l) != arr[i + k].charAt(j + l)){
                            blackCount++;
                        }
                    }
                }
                answer = Math.min(answer, Math.min(whiteCount, blackCount));
            }
        }
        System.out.println(answer);
    }
}