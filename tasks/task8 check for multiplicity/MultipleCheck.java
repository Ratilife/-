public class MultipleCheck{
	public static void main(String[] args ){
		for(int i = 0; i < 100; i++){
			System.out.println(i);
			if(i % 3 == 0 && i % 5 == 0){
				System.out.println("FizzBuzz");
			}
			if(i % 3 == 0){
				System.out.println("Fizz");
			}
			if (i % 5 == 0){
				System.out.println("Buzz");
			}
		}
	} 
}