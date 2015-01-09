package fr.cinematheque.model;

import java.util.Date;

public abstract class Person {
	protected String name, nationality;
	protected Date birthday;
	
	public Person(String name, Date birthday, String nationality){
		this.name = name;
		this.birthday = birthday;
		this.nationality = nationality;
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
