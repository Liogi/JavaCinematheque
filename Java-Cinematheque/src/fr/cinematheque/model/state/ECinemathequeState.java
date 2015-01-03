package fr.cinematheque.model.state;

public enum ECinemathequeState
{
	TRANSACTION_ENDED(	"Transaction ended", 	null),
	TRANSACTION_STARTED("Transaction started", 	TRANSACTION_ENDED),
	TRANSACTION_NULL(	"Transaction null", 	TRANSACTION_STARTED);
	
	/** Following step */
	private ECinemathequeState 		nextStepState;
	
	/** State */
	private String 			state;
	
	
	
	private ECinemathequeState(String state, ECinemathequeState nextStepState)
	{
		this.state 			= state;
		this.nextStepState	= nextStepState;
	}

	public String getState()
	{
		return state;
	}

	public ECinemathequeState getNextStepState()
	{
		return nextStepState;
	}
}
