package fr.cinematheque.model;

import java.util.Date;

public abstract class Person {
	public String name, nationality;
	public Date birthday;
	
	public Person(String name, String nationality, Date birthday)
	{
		createStructure(name, nationality, birthday);
	}
	
	public void createStructure(String name, String nationality, Date birthday)
	{
		this.name = name;
		this.nationality = nationality;
		this.birthday = birthday;
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

}
