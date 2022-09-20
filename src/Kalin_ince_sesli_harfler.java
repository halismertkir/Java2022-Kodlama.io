import java.util.Scanner;


public class Kalin_ince_sesli_harfler {
	public static void main(String[] args) {
		Scanner scna = new Scanner(System.in);
		System.out.println("Bir harf giriniz ");
		String harf = scna.nextLine();
		
		switch(harf){
			case"a":
			case"ý":
			case"o":
			case"u":
				System.out.println("Kalýn  sesli ünlüler");
				break;
			case "e":
			case "i":
			case "ö":
			case "ü":
				System.out.println("Ýnce sesli ünlüler ");
				break;
			default:
				System.out.println("Lütfen sesli harf giriniz !!!");
				break;
			
		}
				
				
			
			
			
		
	}
}
