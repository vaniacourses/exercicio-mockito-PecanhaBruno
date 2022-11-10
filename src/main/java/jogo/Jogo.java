package jogo;

public class Jogo {
	
	private Dado dadinho1 = null;
	private Dado dadinho2 = null;	

	public Jogo() {
		this.dadinho1 = new Dado();
		this.dadinho2 = new Dado();
	}
	
	/*
	 * Se for o primeiro turno e a soma das faces dos dados cair 7 ou 11 voc� ganha o jogo;
	 * Se for o primeiro turno e a soma das faces dos dados cair 2, 3 e 12 voc� perde o jogo; 
	 * Se n�o cair nenhum desses valores, o valor � armazenado e passa para o segundo turno;
	 * Se for o segundo turno e a soma das faces dos dados cair 7 novamente, voc� perde o jogo;
	 * Se for o segundo turno, voc� continuando jogando os dados e s� ganha se cair um numero igual ao anterior do primeiro turno;
	 */
	public boolean Jogar(int ponto, int resultado){		
		
		if(resultado == 7 || resultado == 11) {
			return true;
		}else if(resultado == 2 || resultado == 3 || resultado == 12){
			return false;
		}
		
		ponto  = resultado;
		
		resultado = dadinho1.numero() + dadinho2.numero();
	
		while(resultado != ponto && resultado != 7){
			resultado = (dadinho1.numero() + dadinho2.numero());
		}
		
		return resultado == ponto;			
	}	
}
