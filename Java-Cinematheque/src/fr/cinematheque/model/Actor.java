package fr.cinematheque.model;

import java.util.Date;

public class Actor
{
	private String name, nationality;
	private Date birthday;
	private Integer participatedMovie;
	
	public Actor(String name, String nationality, Date birthday, int participatedMovie)
	{
		createStructure(name, nationality, birthday, participatedMovie);
	}
	
	public void createStructure(String name, String nationality, Date birthday, int participatedMovie)
	{
		this.name = name;
		this.nationality = nationality;
		this.birthday = birthday;
		this.participatedMovie = 0;
	}

	public String getNationality()
	{
		return nationality;
	}

	public void setNationality(String nationality)
	{
		this.nationality = nationality;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Date getBirthday()
	{
		return birthday;
	}

	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}

	public Integer getParticipatedMovie()
	{
		return participatedMovie;
	}

	public void setParticipatedMovie(Integer participatedMovie)
	{
		this.participatedMovie = participatedMovie;
	}
}
