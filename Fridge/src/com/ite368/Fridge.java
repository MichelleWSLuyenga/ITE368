package com.ite368;

import java.util.Collection;
import java.util.HashSet;

public class Fridge {

	private Collection<String> food = new HashSet<String>();

	//add the item to the fridge and return true
	//if the item already exist, return false
	public boolean put(String item) {
		return food.add(item);
	}

	//Returns true if the fridge contains the specified item.
	//Return false otherwise.
	public boolean contains(String item) {
		return food.contains(item);
	}

	//takes an item from the fridge and remove it, and return true; if it does not exist, it will throw exception
	public void take(String item) throws NoSuchItemException {
		boolean result = food.remove(item);
		if (!result) {
			throw new NoSuchItemException(item + " not found in the fridge");
		}
	}
}