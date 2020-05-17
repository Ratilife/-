import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;   
public class Solution{
	public static int even;
	public static int odd;
	
	public static void main(String[] args)throws IOException{
		int a = 0;
		int b = 0;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String s = buffer.readLine();
		int chislo = Integer.parseInt(s);
		while(chislo>0){
			int i = chislo % 10;
			if(i%2==0){
				a ++;
			}else{
				b++;
			}
			System.out.println(i);
			chislo/=10;
			
		}
		System.out.println("Even: "+a+" Odd: "+b); 
	}
}