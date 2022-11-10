package jogo;

import java.util.Random;

public class Dado {
	private static Random gerador = new Random();
	
	public int numero() {
		return gerador.nextInt(6)+1;		
	}
}
