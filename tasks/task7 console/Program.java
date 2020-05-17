import java.util.Scanner;
public class Program{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		int ages = scanner.nextInt();
		scanner.nextLine();
		String city = scanner.nextLine();
		System.out.format("%s!%n"+
			" Поздравляем тебя с %d-летием!%n "+
			"%s, желаем счастье, здоровья, удачи! %n%n"+
			"Твои друзья из города %s%n",name,ages,name,city);
	}
}