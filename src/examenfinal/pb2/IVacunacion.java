package examenfinal.pb2;

public interface IVacunacion {

	public Boolean vacunarseContraCovid();
	public Boolean segundaDosisCovid() throws NoCovidVaccineException;
	public void vacunarseContraHepatitis();
	public void vacunarseContraRubeola();
}
