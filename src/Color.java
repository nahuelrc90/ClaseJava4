
public enum Color {
	BLANCO (255),
	NEGRO (0),
	GRIS (127);
	//ACA DENTRO LOS CONSRUCTORES PUEDEN SER PRIVADOS NADA MAS
	private int valor;
	private Color (int valor){
		this.valor = valor;
	}
	public int getValor (){
		return valor;
	}
}

