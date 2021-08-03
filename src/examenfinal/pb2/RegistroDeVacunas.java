package examenfinal.pb2;

import java.util.Set;
import java.util.TreeSet;

public class RegistroDeVacunas {

	private String centroVacunacion;
	private Persona persona;
	private Set<Persona> listaVacunados;
	
	public RegistroDeVacunas(String centroVacunacion, Persona persona) {
		this.centroVacunacion = centroVacunacion;
		this.persona = persona;
		this.listaVacunados = new TreeSet<Persona>();
	}
	
	public void registarVacunaCovid19() throws PacienteVacunadoException {
		if(persona.getCantVacunasCovid() == 2) {
			this.listaVacunados.add(persona);
		}else if(persona.getCantVacunasCovid() > 2) {
			throw new PacienteVacunadoException();
		}
	}
}
