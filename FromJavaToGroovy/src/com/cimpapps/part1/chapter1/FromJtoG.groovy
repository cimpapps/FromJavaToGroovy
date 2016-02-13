package com.cimpapps.part1.chapter1

class FromJtoG implements Runnable {
	
	static main(args){
		Thread t = new Thread(new FromJtoG());
		t.start();
	}//end of main
		
	
	public void run() {
		10.times {
			println "Catalin este cel mai tare"
			
			//Groovy doesn't force us to handle checked exception
			Thread.sleep(1000)
		}
		
		try {
			openFile("fisiercarenuseEczista")
		}
		//See the special catch that can catch all kinds of exceptions
		catch (ex) {
			println "Nu se eczista fisierul"
		}
		
	}
	
	def openFile(fileName){
		//we can handle when ever we want with 
		//FileNotFoundException
		//no need to throw or try catch in here
		new FileInputStream(fileName)
	}
}//end of class
