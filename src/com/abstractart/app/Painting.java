package com.abstractart.app;

public class Painting extends Art {
	private String paintType;
	
	
	public Painting(String title, String author, String description) {
			super(title, author, description);
	}

	// getters and setters	
	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	@Override
	public void viewArt() {
		// TODO Auto-generated method stub
		
	}
	
	
}
