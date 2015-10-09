package net.sergio.contarlletres;
//Soc en Sergio
public class ContarLletres {

	private static final String STRING = "Hola hola hola";
	
	public static void main(String[] args) {
		String lletres ="";
		for (int i = 0; i<STRING.length();i++) {
			char temp = STRING.charAt(i);
			if(!(comprovaRepetides(temp, lletres))) {
				lletres = lletres + temp;
			}
		}
		lletresRepetides(STRING, lletres);
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
