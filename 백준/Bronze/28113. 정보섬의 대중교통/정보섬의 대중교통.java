import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (B >= N && B > A){
            sb.append("Bus");
        }else if(B >= N && B < A){
            sb.append("Subway");
        }else if(B < N){
            sb.append("Bus");
        }else if(N == A && A == B){
            sb.append("Anything");
        }else if(B >= N && A == B){
            sb.append("Anything");
        }

        System.out.println(sb.toString());
    }
}
