package view;

import java.util.Random;
import java.util.concurrent.Semaphore;

import controller.Controller;

public class Principal {

	public static void main(String[] args) {

		Semaphore semaforo = new Semaphore(1);
		
		Controller[] carros = new Controller[4];
		String[] sentidos = {"cima", "baixo","esquerda","direita"};
		
		
		for(int i = 0; i < carros.length; i++) {
			Random random = new Random();
			int sentido = random.nextInt(4);
			
			carros[i] = new Controller(sentidos[sentido], semaforo);
			carros[i].start();
		}

	}

}
