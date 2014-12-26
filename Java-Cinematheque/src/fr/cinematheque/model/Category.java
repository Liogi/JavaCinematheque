package fr.cinematheque.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Category
{
	private String name, description;
	private Integer categorySize;
	private List<Movie> listMovie = new ArrayList<Movie>();
	
	public Category(){}
	
	public Category(String name, String description)
	{
		createStructure(name, description);
	}
	
	public void createStructure(String name, String description)
	{
		this.name = name;
		this.description = description;
		this.categorySize = 0;
	}
	
	public void addMovie(Movie movie)
	{
		this.categorySize += 1;
		this.listMovie.add(movie);
	}
	
	public int getCategorysize()
	{
		return categorySize;
	}
	
	public void setCategorysize(int categorySize)
	{
		this.categorySize = categorySize;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}

	public List<Movie> getMovie()
	{
		return listMovie;
	}

	public void setMovie(List<Movie> movie)
	{
		this.listMovie = movie;
	}
}
