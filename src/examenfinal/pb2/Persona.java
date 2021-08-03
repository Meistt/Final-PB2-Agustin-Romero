package examenfinal.pb2;

public class Persona implements IVacunacion, Comparable <Persona>{

	private String nombre;
	private Integer dni;
	private Integer cantVacunasCovid;
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
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Vacuna getVacuna() {
		return vacuna;
	}

	public void setVacuna(Vacuna vacuna) {
		this.vacuna = vacuna;
	}
	

	public Integer getCantVacunasCovid() {
		return cantVacunasCovid;
	}

	public Integer getCantVacunasHepatitis() {
		return cantVacunasHepatitis;
	}

	public Integer getCantVacunasRubeola() {
		return cantVacunasRubeola;
	}

	@Override
	public int compareTo(Persona o) {
	
		return this.dni.compareTo(o.dni);
		
	}
	
	
	@Override
	public Boolean vacunarseContraCovid(String nombreVacuna) {
		if(this.cantVacunasCovid == 0 && this.vacuna.getNombreVacuna().equals(nombreVacuna)) {
			this.cantVacunasCovid= 1;
			return true;
		}else {
			return false;
		}
	
	}

	@Override
	public Boolean segundaDosisCovid(String nombreVacuna) throws NoCovidVaccineException {
		this.cantVacunasCovid = 1;
		Boolean estadoVacunacion = null;
		if(this.cantVacunasCovid == 1 && this.vacuna.getNombreVacuna().equals(nombreVacuna)) {
			this.cantVacunasCovid = 2;
			estadoVacunacion = true;
			return estadoVacunacion;
		}else if(this.cantVacunasCovid >=2 && !this.nombre.equals(nombre)) {
			estadoVacunacion= false;
			return estadoVacunacion;
			
		}
		throw new NoCovidVaccineException();
	}

	@Override
	public void vacunarseContraHepatitis() {
		
	}

	@Override
	public void vacunarseContraRubeola() {
		
	}


}
