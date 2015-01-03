package fr.cinematheque.model;

import java.util.Date;

public class Actor extends Person
{

	private Integer participatedMovie;
	
	public Actor(int participatedMovie, String name, String nationality, Date birthday) {
		super(name, nationality, birthday);
		
		createStructure(name, nationality, birthday, 0);
}   
	public void createStructure(String name, String nationality, Date birthday, Integer participatedMOvie)
	{
		this.name = name;
		this.nationality = nationality;
		this.birthday = birthday;
		this.participatedMovie = ParticipatedMovie;
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
