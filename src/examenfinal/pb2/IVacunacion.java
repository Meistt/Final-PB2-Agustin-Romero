package examenfinal.pb2;

public interface IVacunacion {

	public Boolean vacunarseContraCovid(String nombreVacuna);
	public Boolean segundaDosisCovid(String nombreVacuna) throws NoCovidVaccineException;
	public void vacunarseContraHepatitis();
	public void vacunarseContraRubeola();
	
}
