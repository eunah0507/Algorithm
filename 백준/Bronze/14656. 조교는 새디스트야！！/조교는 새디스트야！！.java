import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int count=0;
        
        for(int i = 1; i <= num; i++){
            int a = sc.nextInt();
            
            if(a != i){
                count++;
            }
        }
        System.out.print(count);
    }
}