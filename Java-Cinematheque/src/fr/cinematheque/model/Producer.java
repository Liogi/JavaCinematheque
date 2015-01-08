package fr.cinematheque.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Producer extends Person
{

	private List<Movie> listMovie = new ArrayList<Movie>();
	

	public Producer(String name, Date birthday, String nationality) {
		super(name, birthday, nationality);
	}

	public void createMovie(String name, Date release)
	{
		this.listMovie.add(new Movie(name, release, this));
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
		return "\r\nProducter:\r\n\t" + this.name + " is born in " + this.nationality + " in " + this.birthday
			   + "\r\n\tHe created " + ((this.listMovie != null)? this.listMovie.size() + " movie(s): " + allMovie() : "0 movie");
	}
	
	public String allMovie()
	{
		String str = new String();
		for (Movie m : this.listMovie)
		{
			str += "\r\n\t"+ m.getName();
		}
		return str;
	}
}
