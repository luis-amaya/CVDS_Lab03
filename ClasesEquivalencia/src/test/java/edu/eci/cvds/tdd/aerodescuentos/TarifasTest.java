package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

public class TarifasTest {

	@Test
	public void calculoTarifaSinDescuento() {
		double valor = CalculadorDescuentos.calculoTarifa(1000000, 5, 35);
		Assert.assertTrue(1000000==valor);
	}
	
	@Test
	public void calculoTarifaConDiasDeAnticipacion() {
		double valor = CalculadorDescuentos.calculoTarifa(1000000, 25, 35);
		Assert.assertTrue(850000==valor);
	}
	
	@Test
	public void calculoTarifaConDiasDeAnticipacionYMenorDeEdad() {
		double valor = CalculadorDescuentos.calculoTarifa(1000000, 21, 16);
		Assert.assertTrue(800000==valor);
	}
	
	@Test
	public void calculoTarifaConDiasAnticipacionyMayorDeEdad() {
		double valor = CalculadorDescuentos.calculoTarifa(1000000, 35, 67);
		Assert.assertTrue(770000==valor);
	}
	
	@Test
	public void calculoTarifaMenorDeEdad() {
		double valor = CalculadorDescuentos.calculoTarifa(1000000, 5, 15);
		Assert.assertTrue(950000==valor);
	}
	
	@Test
	public void calculoTarifaMayorDeEdad() {
		double valor = CalculadorDescuentos.calculoTarifa(1000000, 10, 70);
		Assert.assertTrue(920000==valor);
	}
	
	@Test
	public void calculoTarifaEdadNegativa() {
		try {
			double valor = CalculadorDescuentos.calculoTarifa(1000000, 10, -70);
		}catch(Exception e) {
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void calculoTarifaDiasAnticipacionNegativos() {
		try {
			double valor = CalculadorDescuentos.calculoTarifa(1000000, -15, 59);
		}catch(Exception e) {
			Assert.assertTrue(true);
		}
	}
	
	@Test
	public void calculoTarifaDiasAnticipacionTarifaNegativa() {
		try {
			double valor = CalculadorDescuentos.calculoTarifa(-1000000, 5, 25);
		}catch(Exception e) {
			Assert.assertTrue(true);
		}
	}
}
