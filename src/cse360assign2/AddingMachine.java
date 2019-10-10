/*
 * Name: Nithin Sagar Nallagula
 * class ID: 1212968092
 * Assignment number:2
 * Description: The main aim of this assignment is to learn how to push projects on github.
 * This program computes methods such as addition, subtraction and returns total 
 */


package cse360assign2;

/*Declaring AddingMachine class with methods
 * getTotal():int
 * add(value):void
 * subtract(value):void
 * toString():String
 * clear():void
 */

public class AddingMachine {

	
	private int total;
	private String a;
	
	//creating a constructor for class 
	public AddingMachine () {
		total = 0; 
		a = "0";
	}
	
	
	public int getTotal () {
		return total;
	}
	
	
	public void add (int value) {
		a += " + "+ Integer.toString(value);
		total=total+value;
	}
	
	
	public void subtract (int value) {
		a += " - "+ Integer.toString(value);
		total=total-value;
	}
	
	
	public String toString () {
		return a;
	}
	

	public void clear() {
		a="";
		total = 0;
		
	}
}

