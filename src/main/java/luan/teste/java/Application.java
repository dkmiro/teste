package luan.teste.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import luan.teste.java.timer.timer;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		timer meuTimer = new timer();

		
		meuTimer.start();


		//meuTimer.stop();
	}

}
