package com.perisic.beds;

/**
 * This represents an item that has been inserted into 
 * the recycling machine. 
 * @author Marc Conrad
 *
 */
public abstract class DepositItem {
	/**
	 * The running number when the item was inserted. 
	 */
	int number; 
	/** 
	 * the value of the item. 
	 */
	int value; 
	//the value of the item. 
	int weight;
	
	/**
	 * Returns the name of the item. 
	 */
	String getName() { 
		return this.getClass().getSimpleName();   // needs something better. 
	}
}
