package br.com.britoj.shipper;

public class Shipper implements ShippInterface{
	
	/*
	 * Regra geral: Primeiro nome usado at� a primeira vogal encontrada (exceto se come�a por vogal,
	 * ent�o � at� a segunda vogal).
	 * *Caso a letra imediatamente ap�s a primeira vogal seja outra vogal ou um l,
	 *  essa letra tamb�m � inclu�da.
	 */
	@Override
	public String extrairNome1(String personagem) {
		String aux = "";
		int i = 1;
		
		while(aux=="" && i<personagem.length()){
			if(isVogal(personagem.charAt(i))){
				if(i+1<personagem.length()){
					if(isVogal(personagem.charAt(i+1)) || personagem.charAt(i+1)=='l'){
						i++;
					}
				}
				
				aux = personagem.substring(0, i+1);
			}
			i++;
		}
		
		return aux;
	}

	/*
	 * Regra geral: Segundo nome usado a partir da letra imediatamente ap�s a primeira vogal.
	 * *Se o nome come�a com a letra 'A', ent�o ele � completamente acrescentado.
	 * *Caso a letra imediatamente ap�s a primeira vogal seja outra vogal ou um l,
	 *  essa letra tamb�m � exclu�da.
	 */
	@Override
	public String extrairNome2(String personagem) {
		String aux = "";
		int i = 0;
		
		while(aux=="" && i<personagem.length()){
			if(personagem.charAt(0)=='A'){
				aux = personagem.toLowerCase();
			}
			
			else if(isVogal(personagem.charAt(i))){
				if(i+1<personagem.length()){
					if(isVogal(personagem.charAt(i+1)) || personagem.charAt(i+1)=='l'){
						i++;
					}
				}
					
				aux = personagem.substring(i+1, personagem.length());
			}
			i++;
		}
		
		return aux;
	}

	/*
	 * Regra geral: Justapor os nomes assim como foram extra�dos.
	 * *Se o primeiro nome (ainda n�o extra�do) terminar com vogal e o segundo nome (ainda n�o extra�do)
	 *  come�ar com vogal, o primeiro nome perde a �ltima letra antes dos dois serem justapostos.
	 * *Se o primeiro nome (ainda n�o extra�do) terminar com vogal e o segundo nome (ainda n�o extra�do)
	 *  come�ar com 'H', o primeiro nome perde a �ltima letra e o segundo perde a primeira antes dos dois 
	 *  serem justapostos.
	 * *Se a �ltima letra do primeiro nome (j� extra�do) for igual a primeira letra do segundo nome 
	 *  (j� extra�do), a �ltima letra do primeiro nome � eliminada antes dos dois serem justapostos.
	 */
	@Override
	public String combinarNomes(String personagem1, String personagem2) {
		String nome1 = extrairNome1(personagem1);
		String nome2 = extrairNome2(personagem2);
		String combinacao = "";
		
		if(isVogal(personagem1.charAt(personagem1.length()-1)) && isVogal(personagem2.charAt(0))){
			combinacao = personagem1.substring(0, personagem1.length()-1) + personagem2.toLowerCase();
		}
		else if(isVogal(personagem1.charAt(personagem1.length()-1)) && personagem2.charAt(0)=='H'){
			combinacao = personagem1.substring(0, personagem1.length()-1) + 
					personagem2.substring(1, personagem2.length());
		}
		else if(nome1.charAt(nome1.length()-1) == nome2.charAt(0)){
			combinacao = nome1.substring(0, nome1.length()-1) + nome2;
		}
		else{
			combinacao = nome1 + nome2;
		}
		
		System.out.println(combinacao);
		return combinacao;
	}
	
	//############# M�todo auxiliar ######################
	
	@Override
	public boolean isVogal(char letra) {
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'
				|| letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
			return true;
		}
		
		return false;
	}
	
	//########### M�todos auxiliares usados apenas no teste ####################

	@Override
	public String extrairNome2ComecoEmA(String personagem) {
		String aux = "";
		if(personagem.charAt(0)=='A'){
			aux = personagem.toLowerCase();
		}
		
		return aux;
	}
	
	public String extrairNomeVogalInicioEFim(String personagem1,String personagem2){
		String combinacao = "";
		if(isVogal(personagem1.charAt(personagem1.length()-1)) && 
				isVogal(personagem2.charAt(0))){
			combinacao = personagem1.substring(0, personagem1.length()-1) + 
					personagem2.toLowerCase();
		}
		else if(isVogal(personagem1.charAt(personagem1.length()-1)) &&
				personagem2.charAt(0)=='H'){
			combinacao = personagem1.substring(0, personagem1.length()-1) +
					personagem2.substring(1, personagem2.length());
		}
		
		return combinacao;
	}

	@Override
	public String extrairNome2ComLAposVogal(String personagem) {
		String aux = "";
		int i = 0;
		
		while(aux=="" && i<personagem.length()){
			if(isVogal(personagem.charAt(i)) && personagem.charAt(i+1)=='l'){
				aux = personagem.substring(i+2, personagem.length());
			}
			i++;
		}
		
		return aux;
	}
	
	@Override
	public String extrairNome1ComLAposVogal(String personagem) {
		String aux = "";
		int i = 0;
		
		while(aux=="" && i<personagem.length()){
			if(isVogal(personagem.charAt(i)) && personagem.charAt(i+1)=='l'){
				aux = personagem.substring(0, i+2);
			}
			i++;
		}
		
		return aux;
	}

}
