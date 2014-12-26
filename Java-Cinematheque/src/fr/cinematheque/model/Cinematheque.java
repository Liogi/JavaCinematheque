package fr.cinematheque.model;

import java.util.ArrayList;
import java.util.List;

public class Cinematheque
{
	private List<Category> listCategory = new ArrayList<Category>();
	
	public Cinematheque()
	{
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

		sb.append("Cinematheque: \r\n\t This cinema has got"
				+ ((this.listCategory != null)? this.listCategory.size() + " categories for " + totalMovie() + " movies." : " no movie for yet."));

		sb.append("\r\n");
		if (this.listCategory != null)
		{
			sb.append("Category:");
			for (Category c : listCategory)
			{
				sb.append("\r\n\t" + c.toString());
				if (c.getMovie() != null)
				{
					sb.append("\r\nMovie:");
					for (Movie m : c.getMovie())
					{
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
}
