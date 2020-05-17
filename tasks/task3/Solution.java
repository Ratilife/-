import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution{
	public static void main(String[]args) throws Exception{
		int sum = 0; 
		int chislo;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String s = buffer.readLine();
			if(s.equals("Сумма")){
				break;
			}
			chislo = Integer.parseInt(s);
			sum = sum + chislo;
		}
		System.out.println(sum);
	}
}