package com.cimpapps.part1.chapter1

class FromJtoG {
	
	static main(args){
		println printReverse("cimpapps.com")
	}//end of main
		
	static def printReverse(str){
		//check if str is null first
		str?.reverse();
		//in java we had this:
		//if(str!=null){return str.reverse();}
	}
	
	
}//end of class
