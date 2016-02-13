package com.cimpapps.part1.chapter1

class FromJtoG {
	
 	//This is how we did it in java
//	public static void main(String[] args){
//		for (int i = 0; i<3; i++) {
//			System.out.print("ho ");
//		}
//	}
	
	//this is how we do it in Groovy for the same results 
	//as it is above
	//we could also run it as a script, no class declaration
	//no main, and it would work just fine
	static main(args){
		
		String nume = "Catalin";
		for(i in 0..2){
			print "ho "
		}
		//Go to the next row
		println();
		
		//More ways to loop in Groovy
		0.upto(2) {
			println "$nume mananca $it shaworma "
		}
		
		3.times {
			println "$nume mananca $it shaworma "
		}
		
		0.step(10, 2) {
			println "$nume mananca $it shaworma "
		}
		
		
	}//end of main
		
}//end of class
