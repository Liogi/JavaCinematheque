package fr.cinematheque.model;

import java.util.ArrayList;
import java.util.List;


public class Cinematheque
{
	private List<Category> listCategory = new ArrayList<Category>();
	private Integer totalMovie;
	
	public Cinematheque()
	{
		this.totalMovie = 0;
	}
	
	public void totalMovie()
	{
		int size = 0;
		for (Category c : listCategory)
		{
			size += c.getCategorysize();
		}
		this.totalMovie = size;
	}
	public List<Category> getListCategory() {
		return listCategory;
	}

	public void setCategory(List<Category> category) {
		this.listCategory = category;
	}


	
	public Integer getTotalMovie()
	{
		return totalMovie;
	}
	


	public void setTotalMovie(Integer totalMovie)
	{
		this.totalMovie = totalMovie;
	}
}
