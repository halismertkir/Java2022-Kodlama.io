
public class stringlerle�al��mak {
	public static void main(String[] args) {
		// Ders 17 de dakika 5.13 de kald�m .

		String mesaj = "Bug�n hava �ok g�zel .";
		System.out.println("Eleman say�s� : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Ya�as�n !!"));
		System.out.println(mesaj.startsWith("Bug�n"));
		System.out.println(mesaj.endsWith("el ."));
		char[] chars  = new char[10];
		mesaj.getChars (0, 10, chars, 0);
		System.out.println(chars);
		
		System.out.println(mesaj.indexOf('v'));
		System.out.println(mesaj.lastIndexOf("e"));
		System.out.println(mesaj.replace('u' , '�'));
		String newMessage = mesaj.replace(' ' , '-');
		System.out.println(mesaj);
		System.out.println(newMessage);
		System.out.println(mesaj.substring(2));//Mesja�n 2. indexinden itibaren par�ala 
		System.out.println(mesaj.substring(2, 4));// Mesaj� bu indexler aras�nda kes .
		
		for(String kelime : mesaj.split( " ")){//Bunu bir dizi haline getirip bo�uktan itibaren b�ler. 
			System.out.println(kelime );
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		String mesaj2  = "     Bug�n hava �ok g�zel .     ";
		System.out.println(mesaj2.trim());//Bo�luklar� kapat�r 
		
	}
}
