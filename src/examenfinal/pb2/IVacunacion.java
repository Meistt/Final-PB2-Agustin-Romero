package examenfinal.pb2;

public interface IVacunacion {

	public Boolean primeraDosisCovid(String nombreVacuna);
	public Boolean segundaDosisCovid(String nombreVacuna) throws NoCovidVaccineException;
	public Boolean vacunarseContraHepatitis(String tipoHepatitis);
	public void vacunarseContraRubeola();
	
}
