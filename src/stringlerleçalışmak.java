
public class stringlerleçalýþmak {
	public static void main(String[] args) {
		// Ders 17 de dakika 5.13 de kaldým .

		String mesaj = "Bugün hava çok güzel .";
		System.out.println("Eleman sayýsý : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaþasýn !!"));
		System.out.println(mesaj.startsWith("Bugün"));
		System.out.println(mesaj.endsWith("el ."));
		char[] chars  = new char[10];
		mesaj.getChars (0, 10, chars, 0);
		System.out.println(chars);
		
		System.out.println(mesaj.indexOf('v'));
		System.out.println(mesaj.lastIndexOf("e"));
		System.out.println(mesaj.replace('u' , 'ü'));
		String newMessage = mesaj.replace(' ' , '-');
		System.out.println(mesaj);
		System.out.println(newMessage);
		System.out.println(mesaj.substring(2));//Mesjaýn 2. indexinden itibaren parçala 
		System.out.println(mesaj.substring(2, 4));// Mesajý bu indexler arasýnda kes .
		
		for(String kelime : mesaj.split( " ")){//Bunu bir dizi haline getirip boþuktan itibaren böler. 
			System.out.println(kelime );
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		String mesaj2  = "     Bugün hava çok güzel .     ";
		System.out.println(mesaj2.trim());//Boþluklarý kapatýr 
		
	}
}
