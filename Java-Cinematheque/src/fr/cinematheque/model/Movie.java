package fr.cinematheque.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movie
{
	private String name;
	private Date release;
	private Producer producer;
	private List<Actor> listActor = new ArrayList<Actor>();
	
	public Movie(String name, Date release, Producer producer)
	{
		createStructure(name, release, producer);
	}
	
	public void createStructure(String name, Date release, Producer producer)
	{
		this.name = name;
		this.release = release;
		this.producer = producer;
	}

	public void addActor(Actor actor)
	{
		actor.setParticipatedMovie(actor.getParticipatedMovie() + 1);
		this.listActor.add(actor);
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Producer getProducer()
	{
		return producer;
	}

	public void setProducer(Producer producer)
	{
		this.producer = producer;
	}

	public List<Actor> getActor()
	{
		return listActor;
	}

	public void setActor(List<Actor> actor)
	{
		this.listActor = actor;
	}

	public Date getRelease() {
		return release;
	}

	public void setRelease(Date release) {
		this.release = release;
	}
	
	public String toString()
	{
		return this.name + " created in " + this.release + " by " + this.producer.toString();
	}
}
