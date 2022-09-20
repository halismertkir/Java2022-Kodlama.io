import java.util.Scanner;


public class MükemmelSayýlar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayýyý giriniz . . .");
		int number = scan.nextInt();
		
		int total  = 0 ;
		
		for(int i = 1 ; i< number ; i++){
			if(number%i == 0){
				total +=i;
			}
		}
		
		if(total == number){
			System.out.println("Mükemmel sayýdýr . . . :D");
		}
		else{
			System.out.println("Mükemmel sayý deðildir . . . :(");
		}
		
	}
}
