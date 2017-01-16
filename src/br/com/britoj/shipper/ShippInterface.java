package br.com.britoj.shipper;

public interface ShippInterface {
	public String extrairNome1(String personagem);
	public String extrairNome2(String personagem);
	public String extrairNomeVogalInicioEFim(String personagem1,String personagem2);
	public String combinarNomes(String personagem1, String personagem2);
	public String extrairNome2ComecoEmA(String personagem);
	public String extrairNome1ComLAposVogal(String personagem);
	public String extrairNome2ComLAposVogal(String personagem);
	
	public boolean isVogal(char letra);
}
