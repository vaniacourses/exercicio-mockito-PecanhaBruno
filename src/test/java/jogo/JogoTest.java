package jogo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class JogoTest {
	
	@Mock
	Dado mock1_7;
	Dado mock2_7;
	@Test
	void ganhaJogo7() {		
		
		when(mock1_7.numero()).thenReturn(3);
		when(mock2_7.numero()).thenReturn(4);
		int resultado = (mock1_7.numero() + mock2_7.numero());		
		
		Jogo jogo = new Jogo();
		
		assertTrue(jogo.Jogar(resultado, (mock1_7.numero() + mock2_7.numero())));
		assertEquals(resultado, 7);		
	}	
	
	@Mock
	Dado mock1_11;
	Dado mock2_11;
	@Test
	void ganhaJogo11() {		
		
		when(mock1_11.numero()).thenReturn(6);
		when(mock2_11.numero()).thenReturn(5);
		int resultado = (mock1_11.numero() + mock2_11.numero());
		
		Jogo jogo = new Jogo();
		
		assertTrue(jogo.Jogar(resultado, (mock1_11.numero() + mock2_11.numero())));
		assertEquals(resultado, 11);		
	}
	
}
