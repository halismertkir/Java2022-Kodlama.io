public class recapDemo2 {
	public static void main(String[] args) {
		double[] myList = { 1.2, 2.4, 5.5, 63.6, 98756.856 };

		for (double read : myList) {
			System.out.println(read);
		}

		// En büyük sayýyý bulma

		double max = myList[0];
		for (double search : myList) {
			if (max < search) {
				max = search;
			}
		}
		System.out.println("En büyük sayý : " + max);

	}
}
