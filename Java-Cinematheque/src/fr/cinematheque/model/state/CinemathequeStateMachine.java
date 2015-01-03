package fr.cinematheque.model.state;

import fr.cinematheque.model.validation.ValidationException;

public class CinemathequeStateMachine
{
	public static void changeStep(IStateChangeable statedReference) throws ValidationException
	{
		//can call the IValidable interface validate() method, because IValidable extends IStateChangeable
		//any IStateChangeable reference is also a IValidable instance.
		statedReference.validate();
		
		statedReference.setState(statedReference.getState().getNextStepState());
	}
}
