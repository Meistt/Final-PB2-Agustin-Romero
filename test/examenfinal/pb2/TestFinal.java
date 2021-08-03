package examenfinal.pb2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestFinal {

	@Test
	public void queUnPacientePuedaDarseLaPrimerDosis() {
		Persona nueva = new Persona("Agustin", 41716163, new Vacuna ("Astrazeneca"));
		
		Boolean ve = nueva.vacunarseContraCovid("Astrazeneca");
		
		assertTrue(ve);
		
	}
	
	@Test
	public void queUnPacientePuedaDarseLaSegundaDosisYSeaRegistrada() throws NoCovidVaccineException
	{
		Persona paciente = new Persona("Agustin", 41716163, new Vacuna ("Astrazeneca"));
		
		paciente.segundaDosisCovid("Astrazeneca");
		
		RegistroDeVacunas nuevo = new RegistroDeVacunas("UNLaM", paciente);
		
	}
	
	
}
