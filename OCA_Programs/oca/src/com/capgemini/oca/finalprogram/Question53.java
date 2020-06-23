package com.capgemini.oca.finalprogram;

public class Question53 {

}

interface Exportable{
	void export();
}

class Tool implements Exportable{

	@Override
	public void export() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	protected void export() {
//		
//	}
	
}

class Report extends Tool implements Exportable{
	
	public void export() {
		
	}
}
