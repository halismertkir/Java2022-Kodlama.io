import java.util.Scanner;

public class Project1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Say�y� giriniz . . .");
		int number = scan.nextInt();
		int reminder = 0;
		boolean isPrime = true ;
		
		for (int i = 2; i < number; i++) {
			if(number % i == 0 ){
				isPrime = false ;
				break;
			}
		}
		if(isPrime == true ){
			System.out.println("Say� asald�r");
		}
		if(isPrime == false){
			System.out.println("Say� asal de�ildir ");
		}
		
	}
}
