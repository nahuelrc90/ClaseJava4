
public enum Cartas {
	
	ORO,
	BASTO,
	ESPADA,
	COPA;
	
	public Cartas getPalo (){
		Cartas [] palo = Cartas.values();
		int a = (int) (Math.random()*4);
		return palo[a];
	}
	
	
}
