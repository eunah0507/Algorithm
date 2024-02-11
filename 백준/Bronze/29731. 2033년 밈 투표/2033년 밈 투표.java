import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[]{"Never gonna give you up", "Never gonna let you down",
                "Never gonna run around and desert you", "Never gonna make you cry",
                "Never gonna say goodbye", "Never gonna tell a lie and hurt you"
                , "Never gonna stop"};
        String [] str = new String[num];
        boolean flag = true;

        for (int i = 0; i < num; i++) {
            str[i] = sc.nextLine();
            // 입력받은 문장이 공약에 들어있는지 확인하는 것.
            boolean Rick = false;

            // 일치하면 Rick == true로 바꾼다.
            for (int j = 0; j < 7; j++) {
                if (str[i].equals(arr[j])){
                    Rick = true;
                    break;
                }
            }

            // 테스트케이스 비교가 끝난 후, 모두 true이면 flag를 true로 한다.
            if (Rick != true){
                flag = false;
                break;
            }
        }

        if (flag == false){
            sb.append("Yes");
        }else{
            sb.append("No");
        }

        System.out.println(sb.toString());
    }
}
