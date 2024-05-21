import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		double num = Double.parseDouble(br.readLine());
		
		System.out.println(String.format("%.6f", (Math.pow(num, 2) * Math.PI)));
		System.out.println(String.format("%.6f", (2 * Math.pow(num, 2))));
	}

}