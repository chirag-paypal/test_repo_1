import java.util.Scanner;

public class StartingPoint {
	public static void main(String args[]){
		Dog cg = new Dog();
		Scanner inputvar = new Scanner(System.in);
		int finish = inputvar.nextInt();
		
		Scanner inputword = new Scanner(System.in);
		String words = inputword.nextLine();
		while(finish > 0){
//			cg.bark();
			System.out.println(words);
			finish -=1;
		}
		int i = 1;
		System.println("value is " + i);
		System.println("value_new);
	}
	
}
