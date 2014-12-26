package fr.cinematheque.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Producer
{
	private String name, nationality;
	private Date birthday;
	private List<Movie> listMovie = new ArrayList<Movie>();
	
	public Producer(String name, Date birthday, String nationality)
	{
		createStructure(name, birthday, nationality);
	}
	
	public void createStructure(String name, Date birthday, String nationality)
	{
		this.name = name;
		this.birthday = birthday;
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
	
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public List<Movie> getMovie()
	{
		return listMovie;
	}

	public void setMovie(List<Movie> movie)
	{
		this.listMovie = movie;
	}
	
	public String toString()
	{
		return "\r\nProducter: " + this.name + "\r\n\t He is born in " + this.nationality + " in " + this.birthday
			   + "\r\n\tHe created " + ((this.listMovie != null)? this.listMovie.size() + allMovie() : "0 movie");
	}
	
	public String allMovie()
	{
		String str = null;
		for (Movie m : this.listMovie)
		{
			str += "\r\n\t"+ m.getName();
		}
		return str;
	}
}
