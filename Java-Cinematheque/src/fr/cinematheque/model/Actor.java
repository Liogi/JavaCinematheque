package fr.cinematheque.model;

import java.util.Date;

public class Actor extends Person
{
	private Integer participatedMovie;
	
	public Actor(String name, Date birthday, String nationality) {
		super(name, birthday, nationality);
		this.participatedMovie = 0;
	}   
	
	public Integer getParticipatedMovie()
	{
		return this.participatedMovie;
	}

	public void setParticipatedMovie(Integer participatedMovie)
	{
		this.participatedMovie = participatedMovie;
	}
	public String toString()
	{
		return this.name + " is born in " + this.nationality + " in " + this.birthday + " and played in " + this.participatedMovie + " movie(s)";
	}


}
