package examenfinal.pb2;

public class Persona implements IVacunacion, Comparable <Persona>{

	private String nombre;
	private Integer dni;
	private Integer cantVacunasCovid;
	private Integer cantVacunasCovid2;
	private Integer cantVacunasHepatitis;
	private Integer cantVacunasRubeola;
	private Vacuna vacuna;
	
	public Persona (String nombre, Integer dni, Vacuna vacuna) {
		this.nombre = nombre;
		this.dni = dni;
		this.vacuna = vacuna;
		cantVacunasCovid = 0;
		cantVacunasHepatitis = 0;
		cantVacunasRubeola = 0;
	}

	@Override
	public int compareTo(Persona o) {
	
		return this.dni.compareTo(o.dni);
		
	}
	@Override
	public Boolean vacunarseContraCovid() {
		if(this.cantVacunasCovid == 0 && this.nombre.equals(nombre)) {
			this.cantVacunasCovid= 1;
			return true;
		}else {
			return false;
		}
	
	}

	@Override
	public Boolean segundaDosisCovid() throws NoCovidVaccineException {
		Boolean estadoVacunacion = null;
		if(this.cantVacunasCovid == 1 && this.nombre.equals(nombre)) {
			estadoVacunacion = true;
			return estadoVacunacion;
		}else if(this.cantVacunasCovid >=2 && !this.nombre.equals(nombre)) {
			estadoVacunacion= false;
			throw new NoCovidVaccineException();
		}
		return estadoVacunacion;
	}

	@Override
	public void vacunarseContraHepatitis() {
		
	}

	@Override
	public void vacunarseContraRubeola() {
		
	}
}
