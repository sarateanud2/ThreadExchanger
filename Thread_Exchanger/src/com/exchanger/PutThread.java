package com.exchanger;

import java.util.concurrent.Exchanger;

public class PutThread implements Runnable {
	
	Exchanger<String> exchanger;
	String message;
	
	
	
	public PutThread(Exchanger<String> exchanger) {
		super();
		this.exchanger = exchanger;
		message = "Hello Java!";
	}

	@Override
	public void run() {
		try {
			message = exchanger.exchange(message);
			System.out.println("PutThread received " + message);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}



