package fr.cinematheque.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.cinematheque.model.state.ECinemathequeState;
import fr.cinematheque.model.state.IStateChangeable;
import fr.cinematheque.model.validation.ValidationException;

public class Cinematheque implements IStateChangeable
{
	private List<Category> listCategory = new ArrayList<Category>();
	
	private ECinemathequeState state;
	
	public Cinematheque()
	{
		state = ECinemathequeState.TRANSACTION_STARTED;
	}
	
	public int totalMovie()
	{
		int size = 0;
		for (Category c : listCategory)
		{
			size += c.getCategorysize();
		}
		return size;
	}
	
	public void addCategory(Category c)
	{
		c.setCategorysize(c.getCategorysize() + 1);
		this.listCategory.add(c);
	}
	public List<Category> getListCategory() {
		return listCategory;
	}

	public void setCategory(List<Category> category) {
		this.listCategory = category;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();

		sb.append("Cinematheque:\r\n\tState= " + state.toString() + "\r\n\tThis cinema has got "
				+ ((this.listCategory != null)? this.listCategory.size() + " categories for " + totalMovie() + " movies." : " no movie for yet."));

		if (this.listCategory != null)
		{
			for (Category c : listCategory)
			{
				sb.append("\r\n\nCategory:");
				sb.append("\r\n\t" + c.toString());
				if (c.getMovie() != null)
				{
					for (Movie m : c.getMovie())
					{
						sb.append("\r\nMovie:");
						sb.append("\r\n\t" + m.toString());
						sb.append("\r\nActors:");
						for (Actor a : m.getActor())
						{
							sb.append("\r\n\t" + a.toString());
						}
					}
				}
				
			}
		}
		
		return sb.toString();
	}

	@Override
	public ECinemathequeState getState()
	{
		return state;
	}

	@Override
	public void setState(ECinemathequeState cinemathequeState)
	{
		this.state = cinemathequeState;
	}

	@Override
	public void validate() throws ValidationException
	{
		if (this.listCategory.size() == 0)
		{
			throw new ValidationException("Cinematheque instance: listCategory IS NULL !!!");
		}
		for (Iterator<Category> i = this.listCategory.iterator(); i.hasNext(); )
		{
			Category c = i.next(); 
			
			if  ((c.getCategorysize() == 0))
				throw new ValidationException("Category is empty!!");
		}
	}
}
