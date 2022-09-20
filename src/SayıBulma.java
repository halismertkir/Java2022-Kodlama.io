import java.util.Scanner;


public class SayýBulma {
	public static void main(String[] args) {
		int[] numbers = new int[]{1,2,3,4,5,6,7,8,9};
		Scanner scan = new Scanner(System.in);
		System.out.println("Aranmasýný istediðiniz sayýyý giriniz . . . ");
		int findNumber = scan.nextInt();
		boolean varMý = false;
		
		
		
		
		for(int search : numbers){
			if(findNumber == search){
				varMý = true;
				
			}
			
		}
		if(varMý == true){
			System.out.println("Aranan sayý bulunuyor ");
		}else{
			System.out.println("aranan sayý bulunmuyor .");
		}
	}
}
