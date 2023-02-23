package com.abstractart.app;

public class Art {
	private String title;
	private String author;
	private String description;
	
// methods
	public void viewArt() {
		System.out.println(getDescription());
	}
	
// getters and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
