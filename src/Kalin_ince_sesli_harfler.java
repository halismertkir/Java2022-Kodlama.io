import java.util.Scanner;


public class Kalin_ince_sesli_harfler {
	public static void main(String[] args) {
		Scanner scna = new Scanner(System.in);
		System.out.println("Bir harf giriniz ");
		String harf = scna.nextLine();
		
		switch(harf){
			case"a":
			case"�":
			case"o":
			case"u":
				System.out.println("Kal�n  sesli �nl�ler");
				break;
			case "e":
			case "i":
			case "�":
			case "�":
				System.out.println("�nce sesli �nl�ler ");
				break;
			default:
				System.out.println("L�tfen sesli harf giriniz !!!");
				break;
			
		}
				
				
			
			
			
		
	}
}
