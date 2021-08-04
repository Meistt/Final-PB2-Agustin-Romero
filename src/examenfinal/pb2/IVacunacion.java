package examenfinal.pb2;

public interface IVacunacion {

	public Boolean primeraDosisCovid(String nombreVacuna);
	public Boolean segundaDosisCovid(String nombreVacuna) throws NoCovidVaccineException;
	public Boolean vacunarseContraHepatitis(Hepatitis hepatitis) throws NoPuedeVacunarseParaEstaEnfermedadException;
	public void vacunarseContraRubeola();
	
}
