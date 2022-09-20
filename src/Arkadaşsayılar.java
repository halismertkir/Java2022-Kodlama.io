import java.util.Scanner;


public class Arkadaþsayýlar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ýlk sayýyý giriniz .  . .");
		int number1  = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("ikinci sayýyý giriniz . . . ");
		int number2  = scan2.nextInt();
		
		int total1 = 0 ;
		int total2 = 0 ;
		
		for(int i = 1 ; i < number1 ; i++){
			if(number1 % i == 0 ){
				total1 +=i;
			}
		}
		for(int a = 1 ; a< number2 ; a++){
			if(number2 % a == 0 ){
				total2 += a;
			}
		}
		if(total2 == number1 && total1 == number2){
			System.out.println("Bu iki sayý arkadaþ sayýdýr . . . ");
		}
		else{
			System.out.println("Bu iki sayý arkadaþ sayý deðildir . . .");
		}
	}
}
