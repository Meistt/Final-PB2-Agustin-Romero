package examenfinal.pb2;

public class Hepatitis extends Vacuna{
	
	private String tipo;
	
	public Hepatitis(String nombreVacuna, String tipo) {
		super(nombreVacuna);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
