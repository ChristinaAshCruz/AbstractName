package com.abstractart.app;

public class Sculpture extends Art {
	
	private String material;
	
// constructors	
	public Sculpture(String title, String author, String description) {
		super(title, author, description);
	}
	
//getters and setters	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public void viewArt() {
		
		
	}
	
	
}
