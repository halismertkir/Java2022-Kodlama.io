public class arrayler {
	public static void main(String[] args) {
		int[] studentList = new int[30];

		for (int i = 0; i < 30; i++) {
			int total = i * i;
			studentList[i] = total;
		}
		for (int search : studentList) {
			System.out.println(search);
		}

		// Ortalamas�n� almak
		int total = 0;

		for (int search : studentList) {

			total = total + search;

		}
		System.out.println("Listenin ortalamas� = "
				+ (total / studentList.length));

		// �oklu arraylar

		int[][] newList = new int[5][10];
		
		int total1 = 99;
		
		
		for(int i  =0 ; i< 5;i++){
			for(int a = 0 ; a<10 ;a++ ){
				newList[i][a] = total1 - a;
				System.out.println("De�erler bunlar " + newList[i][a]);
			}
		}

	}
}
