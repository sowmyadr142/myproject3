package com.pgm.logic;

class InSufficientBalanceException extends Exception{
	
	
	public InSufficientBalanceException() {

	}
	
	public InSufficientBalanceException(String msg) {
		    super(msg);
		
	}
}


public class Teste {
	public static void main(String[] args) throws InSufficientBalanceException {
		  
		 float balance[] ={1200.00f,1340.0f,450.0f,560.0f};
		 
		 for(int i=0;i<balance.length;i++) {
			 
			 float bal = balance[i];
			 if(bal<=500) {
				  throw new InSufficientBalanceException("Please maintain minimum balance");
				}else {
				 System.out.println(bal);
			 }
			 
		 }
		 
	}

	 
}
