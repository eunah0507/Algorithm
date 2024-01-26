import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static class MemberDate{
        public int age;
        public String name;
        public int order;

        public MemberDate(int age, String name, int order){
            this.age = age;
            this.name = name;
            this.order = order;
        }
    }
    public static void main(String[] args) throws Exception {

        // 이름순, 나이순으로 정렬하기

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        MemberDate [] arr = new MemberDate [num];

        for (int i = 0; i < num; i++) {
            int age;
            String name;
            int order;

            age = sc.nextInt();
            name = sc.next();
            order = i;

            arr[i] = new MemberDate(age, name, order);
        }

        Arrays.sort(arr, (e1, e2) ->{
            if (e1.age < e2.age){
                return -1;
            }else if(e1.age > e2.age){
                return 1;
            }else{
                if (e1.order < e2.order){
                    return -1;
                }else{
                    return 1;
                }
            }
        });

        for (MemberDate memberDate : arr) {
            sb.append(memberDate.age);
            sb.append(" ");
            sb.append(memberDate.name);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}