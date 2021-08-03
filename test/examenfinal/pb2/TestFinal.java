package examenfinal.pb2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestFinal {

	@Test
	public void queUnPacientePuedaDarseLaPrimerDosis() {
		Persona nueva = new Persona("Agustin", 41716163, new Vacuna ("Astrazeneca"));
		
		Boolean ve = nueva.primeraDosisCovid("Astrazeneca");
		
		assertTrue(ve);
		
	}
	
	@Test
	public void queUnPacientePuedaDarseLaSegundaDosisYSeaRegistrado() throws NoCovidVaccineException, PacienteVacunadoException
	{
		Persona paciente = new Persona("Agustin", 41716163, new Vacuna ("Astrazeneca"));
		RegistroDeVacunas nuevo = new RegistroDeVacunas("UNLaM", paciente);
		
		paciente.segundaDosisCovid("Astrazeneca");
		
		nuevo.registarVacunaCovid19(paciente);
		
	}
	@Test
	public void registrarPacienteConLasDosDosis() throws NoCovidVaccineException, PacienteVacunadoException {
		Persona paciente1 = new Persona("Agustin", 41716163, new Vacuna ("Astrazeneca"));
		Persona paciente2 = new Persona ("Milton", 42716789, new Vacuna("Sinopharm"));
		Persona paciente3 = new Persona ("Julia", 42316456, new Vacuna("Sputnik-v"));
		
		paciente1.primeraDosisCovid("Astrazeneca");
		paciente1.segundaDosisCovid("Astrazeneca");
		
		paciente2.primeraDosisCovid("Sinopharm");
		paciente2.segundaDosisCovid("Sinopharm");
		
		paciente3.primeraDosisCovid("Sputnik-v");
		paciente3.segundaDosisCovid("Sputnik-v");
		
		RegistroDeVacunas nuevo1 = new RegistroDeVacunas ("UNLaM", paciente1);
		RegistroDeVacunas nuevo2 = new RegistroDeVacunas ("UNLaM", paciente2);
		RegistroDeVacunas nuevo3 = new RegistroDeVacunas ("UNLaM", paciente3);
		
		nuevo1.registarVacunaCovid19(paciente1);
		nuevo2.registarVacunaCovid19(paciente2);
		nuevo3.registarVacunaCovid19(paciente3);
		
		
		
	}
	@Test
	public void queUnPacienteHayaTenidoHepatitis() {
		Persona paciente = new Persona ("Milton", 42716789, null);
	}
	
}
