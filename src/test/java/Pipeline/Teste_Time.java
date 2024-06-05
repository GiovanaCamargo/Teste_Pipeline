package Pipeline;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import teste.TimeFutebol;

class Teste_Time {

	@Test
	void test() {
		
		TimeFutebol time = new TimeFutebol ();
		
		assertEquals("Palmeiras", time.TimeFutebol());
	}

}
