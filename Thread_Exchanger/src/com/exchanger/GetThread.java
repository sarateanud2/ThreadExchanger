package com.exchanger;

import java.util.concurrent.Exchanger;

public class GetThread implements Runnable {
	
	Exchanger<String> exchanger;
	String message;
	
	public GetThread(Exchanger<String> exchanger) {
		super();
		this.exchanger = exchanger;
		message = "Salut!!!)))";
	}

	@Override
	public void run() {
	
		try {
			message = exchanger.exchange(message);
			System.out.println("GetThread received: " + message);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

/*
Exchanger<String> exchanger;
    String message;
 
    GetThread(Exchanger ex){
         
        this.exchanger=ex;
        message = "Привет мир!";
    }
    public void run(){
         
        try{
            message=exchanger.exchange(message);
            System.out.println("GetThread получил: " + message);
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
} 
*/
