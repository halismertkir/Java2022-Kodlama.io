import java.util.Scanner;

public class recapdemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		System.out.println("�lk say�y� giriniz ");
		int sayi1 = scan.nextInt();
		System.out.println("�kinci say�y� giriniz ");
		int sayi2 = scan.nextInt();

		if (sayi1 > sayi2) {
			System.out.println(sayi1 + " say�s� " + sayi2
					+ " say�s�ndan b�y�kt�r");
		} 
		else {
			System.out.println(sayi2 + " say�s� " + sayi1
					+ " say�s�ndan b�y�kt�r. ");
		}

	}
}
