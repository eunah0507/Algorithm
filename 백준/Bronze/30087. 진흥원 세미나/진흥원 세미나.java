import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            String str = sc.next();

            if (str.equals("Algorithm")){
                sb.append(204);
                sb.append("\n");
            }else if(str.equals("DataAnalysis")){
                sb.append(207);
                sb.append("\n");
            }else if (str.equals("ArtificialIntelligence")){
                sb.append(302);
                sb.append("\n");
            }else if (str.equals("CyberSecurity")){
                sb.append("B101");
                sb.append("\n");
            }else if(str.equals("Network")){
                sb.append(303);
                sb.append("\n");
            }else if(str.equals("Startup")){
                sb.append(501);
                sb.append("\n");
            }else if(str.equals("TestStrategy")){
                sb.append(105);
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());

    }
}
