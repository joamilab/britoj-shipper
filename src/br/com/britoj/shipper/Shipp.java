package br.com.britoj.shipper;

public class Shipp{
	
	private String personagem1;
	private String personagem2;
	private String combinacao;
	
	public Shipp(String personagem1, String personagem2){
		this.personagem1 = personagem1;
		this.personagem2 = personagem2;
	}
	
	public String getPersonagem1() {
		return personagem1;
	}

	public void setPersonagem1(String personagem1) {
		this.personagem1 = personagem1;
	}

	public String getPersonagem2() {
		return personagem2;
	}

	public void setPersonagem2(String personagem2) {
		this.personagem2 = personagem2;
	}

	public String getCombinacao() {
		return combinacao;
	}

	public void setCombinacao(String combinacao) {
		this.combinacao = combinacao;
	}

}
