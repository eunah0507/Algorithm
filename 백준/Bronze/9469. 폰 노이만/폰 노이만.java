import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numP = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < numP; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
            
			double numD = Double.parseDouble(st.nextToken());
			double numA = Double.parseDouble(st.nextToken());
			double numB = Double.parseDouble(st.nextToken());
			double numF = Double.parseDouble(st.nextToken());
			
			System.out.println(num + " " + String.format("%.6f", ((numD / (numA + numB)) * numF)));
		}
	}

}