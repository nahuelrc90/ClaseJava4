import java.util.Math;

public class CartasTest {

	public static void main(String[] args) {
		int a = (int) (Math.random()*4);
		System.out.println(a);
		
	}
	
	public int getPalo (){
		Cartas [] palo = Cartas.values();
		int a = (int) (Math.random()*4);
		return palo[a];
	}
	
	
}
