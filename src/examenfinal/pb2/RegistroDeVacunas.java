package examenfinal.pb2;

import java.util.Set;
import java.util.TreeSet;

public class RegistroDeVacunas {

	private String centroVacunacion;
	private Persona persona;
	private Set<Persona> listaVacunados;
	
	public RegistroDeVacunas(String centroVacunacion) {
		this.centroVacunacion = centroVacunacion;
		this.listaVacunados = new TreeSet<Persona>();
	}
	
	public void registarVacunaCovid19(Persona paciente) throws PacienteVacunadoException {
		if(paciente.getCantVacunasCovid() == 2) {
			this.listaVacunados.add(paciente);
		}else if(paciente.getCantVacunasCovid() > 2) {
			throw new PacienteVacunadoException();
		}
	}

	public Set<Persona> getListaVacunados() {
		return listaVacunados;
	}

	public void setListaVacunados(Set<Persona> listaVacunados) {
		this.listaVacunados = listaVacunados;
	}
	
	
}
