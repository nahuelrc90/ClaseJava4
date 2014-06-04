
public class CartasTest {


	public static void main(String[] args) {
		
		//creo una instancia de numero
		Numero n = new Numero();
		
		//obtengo un array de los tipos creados en el enum
		Cartas [] palo = Cartas.values();
		//genero un random para acceder a cualquier posicion 
		int a = (int) (Math.random()*4);
		
		//Muestro la carta generada al azar
		System.out.println(" Carta: " + n.getNumero() + " de " + palo[a]);
		
		
		
	}
	
		
}
