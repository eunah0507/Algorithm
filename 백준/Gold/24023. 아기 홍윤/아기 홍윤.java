import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] bit = new int[32];

    public static int plusBit(int num, int curSum) {
        int index = 0;
        while (num != 0) {
            if (num % 2 == 1) {
                if (bit[index] == 0) curSum += Math.pow(2, index);
                bit[index]++;
            }
            num /= 2;
            index++;
        }
        return curSum;
    }

    public static int minusBit(int num, int curSum) {
        int index = 0;
        while (num != 0) {
            if (num % 2 == 1) {
                bit[index]--;
                if (bit[index] == 0) curSum -= Math.pow(2, index);
            }
            num /= 2;
            index++;
        }
        return curSum;
    }

    public static void println() {
        for (int i = 0; i < 32; i++) {
            System.out.print(bit[i] >= 1 ? '1' : '0');
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N + 1];


        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int left = 0;
        int right = 1;
        int answer = plusBit(arr[1],0);


        while (true) {

//            System.out.println("left : "+left+", right : "+right);
//            println();
            if (answer == K) {
                left++;
                System.out.println(left + " " + right);
                break;
            } else if (answer < K) {
                if (right >= N) {
                    System.out.println(-1);
                    break;
                }
                right++;
                answer = plusBit(arr[right], answer);
            } else {
                if (left >= N) {
                    System.out.println(-1);
                    break;
                }
                left++;
                answer = minusBit(arr[left], answer);
            }
        }
    }
}
