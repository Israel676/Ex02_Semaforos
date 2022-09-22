package controller;

import java.util.concurrent.Semaphore;

public class Controller extends Thread {
	
	public String sentido;
	private Semaphore semaforo;
	
	public Controller(String sentido, Semaphore semaforo){
		this.sentido = sentido;
		this.semaforo = semaforo;
	}
	
	@Override
	public void run() {
		
		try {
			semaforo.acquire();
			imprimeSentido();
		} 
		
		catch (Exception e) {
		}
		
		semaforo.release();
	}
	
	public void imprimeSentido() {
		System.out.println("Carro esta passando no sentido: " + sentido);
	}
	
	public void some() {
		System.out.println(sentido);
	}
	
}
