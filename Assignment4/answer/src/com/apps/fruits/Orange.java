package com.apps.fruits;

public class Orange extends Fruit
{
	
	public Orange(String color, double weight, String name) {
		
		super(color , weight , name);
	}
    
	@Override
	public String taste() {
		return "sour";
	}

	}
	