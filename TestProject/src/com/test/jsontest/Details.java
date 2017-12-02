package com.test.jsontest;

import java.util.List;

public class Details {

	private String name;
	private int age;
	private List<Favourites> favourites;
	private List<String> interests;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Favourites> getFavourites() {
		return favourites;
	}
	public void setFavourites(List<Favourites> favourites) {
		this.favourites = favourites;
	}
	public List<String> getInterests() {
		return interests;
	}
	public void setInterests(List<String> interests) {
		this.interests = interests;
	}
}
