import java.util.Scanner;


public class Say�Bulma {
	public static void main(String[] args) {
		int[] numbers = new int[]{1,2,3,4,5,6,7,8,9};
		Scanner scan = new Scanner(System.in);
		System.out.println("Aranmas�n� istedi�iniz say�y� giriniz . . . ");
		int findNumber = scan.nextInt();
		boolean varM� = false;
		
		
		
		
		for(int search : numbers){
			if(findNumber == search){
				varM� = true;
				
			}
			
		}
		if(varM� == true){
			System.out.println("Aranan say� bulunuyor ");
		}else{
			System.out.println("aranan say� bulunmuyor .");
		}
	}
}
