import java.util.Scanner;


public class M�kemmelSay�lar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Say�y� giriniz . . .");
		int number = scan.nextInt();
		
		int total  = 0 ;
		
		for(int i = 1 ; i< number ; i++){
			if(number%i == 0){
				total +=i;
			}
		}
		
		if(total == number){
			System.out.println("M�kemmel say�d�r . . . :D");
		}
		else{
			System.out.println("M�kemmel say� de�ildir . . . :(");
		}
		
	}
}
