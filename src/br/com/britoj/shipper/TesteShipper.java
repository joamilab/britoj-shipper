package br.com.britoj.shipper;

import junit.framework.TestCase;

import org.junit.Test;

public class TesteShipper extends TestCase{
	Shipp shipp;
	Shipper shipper;
	
	protected void setUp(){
		String p1 = "Cosima";
		String p2 = "Delphine";
		shipp = new Shipp(p1, p2);
		shipper = new Shipper();
	}
	
	@Test
	public void testeIsVogal(){
		assertEquals(true, shipper.isVogal('U'));
	}

	
	@Test
	public void testeExtrairNome1AtePrimeiraVogal(){
		assertEquals("Co", shipper.extrairNome1(shipp.getPersonagem1()));
	}
	
	@Test
	public void testeExtrairNome2AposPrimeiraVogal(){
		assertEquals("phine", shipper.extrairNome2(shipp.getPersonagem2()));
	}
	
	@Test
	public void testeExtrairNome2ComecoEmA(){
		assertEquals("", shipper.extrairNome2ComecoEmA(shipp.getPersonagem2()));
	}
	
	@Test
	public void testeExtrairNomesVogalInicioEFim(){
		assertEquals("", shipper.extrairNomeVogalInicioEFim(shipp.getPersonagem1(),
				shipp.getPersonagem2()));
	}
	
	@Test
	public void testeExtrairNome1ComLAposVogal(){
		assertEquals("Del", shipper.extrairNome1ComLAposVogal(shipp.getPersonagem2()));
	}
	
	@Test
	public void testeExtrairNome2ComLAposVogal(){
		assertEquals("phine", shipper.extrairNome2ComLAposVogal(shipp.getPersonagem2()));
	}
	
	@Test
	public void testeCombinarNomes(){
		assertEquals("Cophine", shipper.combinarNomes(shipp.getPersonagem1(), shipp.getPersonagem2()));
		assertEquals("Delsima", shipper.combinarNomes(shipp.getPersonagem2(), shipp.getPersonagem1()));
	}
	
}
