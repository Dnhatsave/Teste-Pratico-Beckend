package com.tecnholus.testepraticobeckend;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tecnholus.testepraticobeckend.domain.Cambio;
import com.tecnholus.testepraticobeckend.repositories.CambioRepository;

@SpringBootApplication
public class TestePraticoBeckendApplication implements CommandLineRunner {

	@Autowired
	private CambioRepository cambioRepository;
	public static void main(String[] args) {
		SpringApplication.run(TestePraticoBeckendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

		
		// Instanciacao do objectos de cambio USD, MZN e ZAR
    	Cambio cambioUSD = new Cambio(null,1658275352,"Wed, 20 Jul 2022 00:02:32 +0000",1658362382, "Thu, 21 Jul 2022 00:13:02 +0000",0,"USD");
    	Cambio cambioMZN = new Cambio(null,424234553,"Wed, 20 Jul 2022 00:02:32 +0000",234234255, "Thu, 21 Jul 2022 00:13:02 +0000",0,"MZN");
    	Cambio cambioZAR = new Cambio(null,566885,"Wed, 20 Jul 2022 00:02:32 +0000",53234445, "Thu, 21 Jul 2022 00:13:02 +0000",0,"ZAR");
		
    	cambioRepository.saveAll(Arrays.asList(cambioMZN,cambioUSD,cambioZAR));
	}

}
