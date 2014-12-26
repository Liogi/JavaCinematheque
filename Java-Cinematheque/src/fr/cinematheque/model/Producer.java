package fr.cinematheque.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Producer
{
	private String name, nationality;
	private List<Movie> listMovie = new ArrayList<Movie>();
	
	public Producer(String name, String nationality)
	{
		createStructure(name, nationality);
	}
	
	public void createStructure(String name, String nationality)
	{
		this.name = name;
		this.nationality = nationality;
	}
	
	public void createMovie(String name, Date release)
	{
		this.listMovie.add(new Movie(name, release, this));
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
