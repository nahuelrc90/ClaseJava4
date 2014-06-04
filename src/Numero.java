import java.util.*;

public class Numero {
	
	//genero el array con los 12 numeros de la baraja española
	int [] numero = new int [12];
	
	//lleno el array
	public Numero(){
		for ( int i = 0; i<12; i++){
			numero [i] = i+1;
		}	
	}	
	
	public int getNumero (){
		
		int a = (int) (Math.random()*12);
		//pruebo que de un random menor a 12
		//System.out.println("RANDOM NUM: " + a);
		return numero[a];
	}
	
}
