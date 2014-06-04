import java.util.*;

public class Numero {
	
	
	int [] numero = new int [12];
	
	private void Numero (){
		for ( int i = 0; i<12; i++){
		numero [i] = i+1;
		}	
	}

	
	public int getNumero (){
		
		int a = (int) (Math.random()*12);
		return numero[a];
	}
	
}
