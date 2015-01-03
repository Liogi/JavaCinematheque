package fr.cinematheque.model.state;

import fr.cinematheque.model.validation.IValidable;

public interface IStateChangeable extends IValidable
{
	public ECinemathequeState getState();

	public void setState(ECinemathequeState orderState);
}
