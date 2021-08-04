package examenfinal.pb2;

public class Hepatitis extends Enfermedad{
	
	private String tipo;
	
	public Hepatitis(String nombre, String tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
