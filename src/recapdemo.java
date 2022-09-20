import java.util.Scanner;

public class recapdemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		System.out.println("İlk sayıyı giriniz ");
		int sayi1 = scan.nextInt();
		System.out.println("İkinci sayıyı giriniz ");
		int sayi2 = scan.nextInt();

		if (sayi1 > sayi2) {
			System.out.println(sayi1 + " sayısı " + sayi2
					+ " sayısından büyüktür");
		} 
		else {
			System.out.println(sayi2 + " sayısı " + sayi1
					+ " sayısından büyüktür. ");
		}

	}
}
