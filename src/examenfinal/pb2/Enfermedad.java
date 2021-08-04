package examenfinal.pb2;

public abstract class Enfermedad {

	private String nombre;
	
	public Enfermedad(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
