package net.sergio.contarlletres;
//Soc en Sergio
public class ContarLletres {
//Em dic Rovira Sergio
	private static final String STRING = "Hola 5hola que passa aqui 6hola5";
	
	public static void main(String[] args) {
		String lletres ="";
		int contadorNumeros = 0; //CONTADOR DELS NUMEROS
		for (int i = 0; i<STRING.length();i++) {
			char temp = STRING.charAt(i);
			if(!(comprovaRepetides(temp, lletres))) {
				lletres = lletres + temp;
			}
		}
		lletresRepetides(STRING, lletres);
		System.out.println("Hi han " + contadorNumeros + " numeros");
	}
	private static boolean esEnter(char temp) { //METODE QUE REALITZA LA COMPROVACIÓ
		try {
			String stringTemp = "" + temp;
			Integer.parseInt(stringTemp);
			return true;
		}catch (Exception e) {
			return false;
		}
			
	}
	private static void lletresRepetides(String string2, String lletres) {
		for (int i = 0; i<lletres.length();i++) {
			int contador = 0;
			for (int j = 0; j<STRING.length();j++) {
				if (lletres.charAt(i)==STRING.charAt(j)) {
					contador ++;
				}
			}
			System.out.println("La lletra " + lletres.charAt(i) + " es repeteix " + contador + " vegades");
		}
	}
	private static boolean comprovaRepetides(char temp, String lletres) {
		String lletra = "" + temp;
		if (lletra.equals(" ")) return true;
		if (lletres.indexOf(temp)>0) {
			return true;
		}
		return false;
	}
}
