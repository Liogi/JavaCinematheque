package fr.cinematheque.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import fr.cinematheque.model.Actor;
import fr.cinematheque.model.Category;
import fr.cinematheque.model.Cinematheque;
import fr.cinematheque.model.Movie;
import fr.cinematheque.model.Producer;
import fr.cinematheque.model.state.CinemathequeStateMachine;
import fr.cinematheque.model.validation.ValidationException;

public class Main {

	public static void main(String[] args) {
		buildEntities();
	}

	public static void buildEntities()
	{
		//Categories
		Category c1	= new Category("Action", "Film d'action pour les ferreux d'effets speciaux");
		Category c2	= new Category("Amour", "Film avec une histoire de romance mais peu d'actions");
		Category c3	= new Category("Sciences fictions", "Film irréaliste racontant une histoire surnaturelle");
		Calendar cal = new GregorianCalendar();
		cal.clear();
		cal.set(1985, 10, 25);
		Producer p1 = new Producer("Alpha", cal.getTime(), "France");
		cal.set(1999, 10, 19);
		Producer p2 = new Producer("Beta", cal.getTime(), "Allemagne");
		cal.set(2001, 1, 1);
		Producer p3 = new Producer("Gamma", cal.getTime(), "Angleterre");
		
		cal.set(1963, 8, 14);
		Actor a1 = new Actor("Joe", "Amerique", cal.getTime());
		cal.set(1979, 3, 12);
		Actor a2 = new Actor("Eddy", "Amerique", cal.getTime());
		cal.set(1988, 12, 25);
		Actor a3 = new Actor("Amelie", "Hollande", cal.getTime());
		cal.set(1981, 4, 1);
		Actor a4 = new Actor("Steeve", "France", cal.getTime());
		cal.set(1969, 11, 29);
		Actor a5 = new Actor("Fabrice", "Amerique", cal.getTime());
		cal.set(1974, 2, 6);
		Actor a6 = new Actor("Laurent", "Amerique", cal.getTime());
		
		cal.set(2015, 5, 20);
		p2.createMovie("Iron Noob", cal.getTime());
		cal.set(2015,  10, 9);
		p1.createMovie("Love in Paris", cal.getTime());
		cal.set(2018, 5, 20);
		p3.createMovie("La corrida in English", cal.getTime());
		cal.set(2017, 5, 18);
		p2.createMovie("Iron Noob 2", cal.getTime());
		cal.set(2019, 5, 20);
		p2.createMovie("Iron Noob 3", cal.getTime());
		p2.getMovie().get(0).addActor(a1);
		p2.getMovie().get(0).addActor(a5);
		p2.getMovie().get(0).addActor(a6);
		p2.getMovie().get(1).addActor(a1);
		p2.getMovie().get(1).addActor(a5);
		p2.getMovie().get(1).addActor(a6);
		p2.getMovie().get(2).addActor(a1);
		p2.getMovie().get(2).addActor(a5);
		p2.getMovie().get(2).addActor(a6);
		p1.getMovie().get(0).addActor(a2);
		p3.getMovie().get(0).addActor(a3);
		p3.getMovie().get(0).addActor(a4);
		
		c3.addMovie(p2.getMovie().get(0));
		c3.addMovie(p2.getMovie().get(1));
		c3.addMovie(p2.getMovie().get(2));
		c2.addMovie(p1.getMovie().get(0));
		c1.addMovie(p3.getMovie().get(0));

		Cinematheque c = new Cinematheque();
		
		System.out.println(c.toString());
		
		System.out.println("\r\nMain: try to change Order state...");
		try
		{
			CinemathequeStateMachine.changeStep(c);
		}
		catch (ValidationException e)
		{
			System.out.println("Main: CinemathequeStateMachine.changeStep() throws " + e.toString());
		}
		//a
		c.addCategory(c1);
		c.addCategory(c2);
		c.addCategory(c3);
		
		try
		{
			CinemathequeStateMachine.changeStep(c);
		}
		catch (ValidationException e)
		{
			System.out.println("Main: CinemathequeStateMachine.changeStep() throws " + e.toString());
			}

		System.out.println("\r\nMain: after re-setting the mandatory reference, order state is now: " + c.getState().toString() + "\r\n\n" + c.toString());
	}	
}
