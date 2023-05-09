package com.citiustech.features;



interface EvenNumber{
	boolean checkEvenNumber(int n);
}
public  class LambdaExpression {
	public static void main(String [] args){
	EvenNumber even = (n) -> {if(n%2==0){return true;}return false;};
	System.out.printf("%b",even.checkEvenNumber(21));
	}

	

}
